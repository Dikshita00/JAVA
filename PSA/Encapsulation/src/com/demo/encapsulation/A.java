package com.demo.encapsulation;
/*
 * it is the mechanism of wrapping the data (variable) and the code (method) together as a single unit
 * and restricting direct access to some of the object's components 
 * 
 * 
 * DATA HIDING : fields/variable of a class are make private so they cannot be accessed directly from
 * 				 outside the class
 * 
 * PUBLIC GETTER AND SETTER : these methods are provided to access and update the value of private 
 * 							  fields.
 */
public class A {
	
	private int x;   //first achieve data hiding by making variable private
	private int y;
	
	public void setX(int x) { //all method should be non static
		this.x=x;
	}
	/*
	 * getter and setter 
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	
	public int getY() {
		return y;
	}

	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}
	
	
}
