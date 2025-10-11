package com.day4;

import java.util.Date;

public class StudentNew {
	private int id;
    private String name;
    private float marks1;
    private float marks2;
    private Date dob;

    // Constructor
    public  StudentNew(int id, String name, float marks1, float marks2, Date dob) {
        this.id = id;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.dob = dob;
    }

    // toString() for display
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks1: " + marks1 + ", Marks2: " + marks2 + ", DOB: " + dob;
    }
}
