package com.day4;

import java.sql.Date;

public class Student {
	private int id;
	private String name;
	private float marks1;
	private float marks2;
	private Date date;
	
	public Student() {
		System.out.println("Inside Default Constructor");
		id=0;
		name=null;
		marks1=0.0f;
		marks2=0.0f;
		date=null;
		
	}
	public Student(int id,String n, float m1,float m2, Date d) {
		System.out.println("Inside Parameterise Constructor");
		this.id=id;
		this.name=n;
		this.marks1=m1;
		this.marks2=m2;
		this.date=d;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks1=" + marks1 + ", marks2=" + marks2 + ", date=" + date
				+ "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks1() {
		return marks1;
	}
	public void setMarks1(float marks1) {
		this.marks1 = marks1;
	}
	public float getMarks2() {
		return marks2;
	}
	public void setMarks2(float marks2) {
		this.marks2 = marks2;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
