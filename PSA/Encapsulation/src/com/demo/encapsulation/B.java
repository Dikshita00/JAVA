package com.demo.encapsulation;

public class B {
	
	public static void main(String[] args) {
		A a1=new A();
		//a1.x=10;
		a1.setX(100);
		a1.setY(200);
		
		System.out.println(a1.getY());
		System.out.println(a1.getX());
	}
	
	
	
	

}
