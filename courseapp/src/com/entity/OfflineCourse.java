package com.entity;

public class OfflineCourse extends Course{

	private String classroomNumber;
	private String location;
	
	public OfflineCourse(int courseId, String courseName, int duration, double fees, String status,
			String classroomNumber, String location) {
		super(courseId, courseName, duration, fees, status);
		this.classroomNumber = classroomNumber;
		this.location = location;
	}

	public String getClassroomNumber() {
		return classroomNumber;
	}

	public void setClassroomNumber(String classroomNumber) {
		this.classroomNumber = classroomNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "OfflineCourse [classroomNumber=" + classroomNumber + ", location=" + location + "]";
	}
	
	
	

}
