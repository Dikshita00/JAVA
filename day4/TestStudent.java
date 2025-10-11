package com.day4;

import java.sql.Date;

public class TestStudent {
	public static void main(String[] args) {
		Student s1=new Student(12,"Dikshita",98,97,new Date(2022,11,23));
		System.out.println(s1);
		
		Student s2=new Student(13,"Stefen",60,80,new Date(2001,10,20));
		System.out.println(s2);
		
		s1.setName("Elena");
	}

}
