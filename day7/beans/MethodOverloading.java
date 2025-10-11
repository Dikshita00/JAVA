package com.day7.beans;

import java.util.Iterator;

public class MethodOverloading {
	public int test(int a,int...n) {
		int sum=a;
		for(int x:n) {
			sum+=x;
		}
		return sum;
		
	}
	public int test(int a,int b, int c) {
		a=12;
		b=20;
		c=1;
		return a>b?a:b;
	}
	public String test(String a, String b) {
		return a.length()>b.length()?a:b;
	}
	public float test(float a,float b) {
		a=13.23f;
		b=0.9f;
		return a+b;
	}
	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		System.out.println(obj.test(1, 2,3,4,5,6,7,89));
		System.out.println(obj.test(100, 500,200));
		System.out.println(obj.test("Dikshita", "Singh"));
		System.out.println(obj.test(45.5f, 45.34f));
		
	}
	
}
