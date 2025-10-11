package com.day7.TEST;

import com.day7.beans.MyClass;
import com.day7.interfaces.I1;

public class TestMyClassInterfaces {
	 public static void main(String[] args) {
			MyClass ob=new MyClass();
			ob.m2(10);
		    I1 ob2=(I1) new MyClass();
		    ob2.m1();
		    ((MyClass) ob2).m3();
		    MyClass ob3=new MyClass();
		    ((MyClass)ob3).m1();
		    
		   }

}
