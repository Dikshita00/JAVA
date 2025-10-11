package com.day7.beans;

public class MyClass implements I1,I2, com.day7.interfaces.I1{
	@Override
	public void m1() {
		System.out.println("in m1 method");
		
	}
	@Override
	public void m2(int x) {
	    System.out.println("in m2 method "+x);
		
	}

	/*@Override
	public void m2() {
		System.out.println("in m2 method without parameter");
		
	}*/

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	//@Override
	/*public void m4() {
		I1.super.m4();
		I2.super.m4();
		
	}*/
	public static void main(String[] args) {
	    MyClass obj = new MyClass();
	    obj.m1();
	    obj.m2(42);
	    obj.m3();
	}

	

}
