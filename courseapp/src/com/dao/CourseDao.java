package com.dao;

import java.util.LinkedList;

import com.entity.Course;

public class CourseDao {
	
	private LinkedList<Course> courseList = new LinkedList<>();
	
	public void addCourse(Course c) {
		courseList.add(c);
	}
	
	public boolean removeCourse(int id) {
		return courseList.removeIf(c -> c.getCourseId()==id);
		
	}
	public LinkedList<Course> getAllCourse(){
		return courseList;
	}
}
