package com.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.dao.CourseDao;
import com.entity.Course;

public class CourseService {
	
	private CourseDao dao = new CourseDao();
	
	public void addCourse(Course c) {
		dao.addCourse(c);
		System.out.println("Course added");
	}
	
	public void removeCourse(int id) {
		if(dao.removeCourse(id)) 
			System.out.println("Course removed");
		else
			System.out.println("Course not found");
	}
	
	public void updateFees(int id, double fees) {
		for(Course c : dao.getAllCourse()) {
			if (c.getCourseId()==id) {
				c.setFees(fees);
				System.out.println("Fees updated");
				return;
			}
		}System.out.println("Course not found");
	}
	
	public void changeStatus(int id) {
		for(Course c : dao.getAllCourse()) {
			if(c.getCourseId()==id) {
				if(c.getStatus().equalsIgnoreCase("Active"))
				   c.setStatus("INactive");
				else
				   c.setStatus("Active");
			    System.out.println("Status changed"); 
			    return; 
			}
		}
	}
	public void entroll(String type, int maxDuration) {
		for(Course c : dao.getAllCourse()) {
			if(c.getClass().getSimpleName().equalsIgnoreCase(type)
				&& c.getDuration() <= maxDuration
				&& c.getStatus().equalsIgnoreCase("Active")){
			System.out.println("Enrolled in : " + c);
			}
		}
	}
	
	public void displayAll() {
		dao.getAllCourse().forEach(System.out::println);
	}
	
	public void displayByType(String type) {
		for(Course c : dao.getAllCourse()) {
			if(c.getClass().getSimpleName().equalsIgnoreCase(type)) {
				System.out.println(c);
			}
		}
	}
	public void feesLessThan(double maxFees) {
		for(Course c : dao.getAllCourse()) {
			if(c.getFees() < maxFees) {
				System.out.println(c);
			}
		}
	}
	
	public void sortByDuration() {
		List<Course> list = new ArrayList<>(dao.getAllCourse());
		list.sort(Comparator.comparingInt(Course::getDuration));
		list.forEach(System.out::println);
	}
	
	public void searchByName(String name) {
		for(Course c : dao.getAllCourse()) {
			if (c.getCourseName().equalsIgnoreCase(name)) {
				System.out.println(c);
			}
		}
	}
}
