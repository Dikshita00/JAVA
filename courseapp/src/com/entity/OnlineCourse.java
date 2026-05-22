package com.entity;

public class OnlineCourse extends Course{

	private String platformName;
	private String instructorName;
	
	public OnlineCourse(int courseId, String courseName, int duration, double fees, String status, String platformName,
			String instructorName) {
		super(courseId, courseName, duration, fees, status);
		this.platformName = platformName;
		this.instructorName = instructorName;
	}

	public String getPlatformName() {
		return platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	@Override
	public String toString() {
		return "OnlineCourse [platformName=" + platformName + ", instructorName=" + instructorName + "]";
	}
	
	
	
}
