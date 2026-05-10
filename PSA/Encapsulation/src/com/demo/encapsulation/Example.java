package com.demo.encapsulation;
//singleton --> single means one ton means object
// the object created once you initialize the value in that object the value of that object can not be changing
public class Example {
	
	final private String name=null;
	final private String password=null;
	
	public Example(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
