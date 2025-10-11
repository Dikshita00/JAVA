package com.day7.TEST;

import com.day7.interfaces.MyComparable;
import com.day7.interfaces.MyGeneric2;
import com.day7.interfaces.MyGenericClass;

public class TestFunctionInterface {
	public static void main(String[] args) {
		MyComparable ob1=new MyComparable() {
			
			@Override
			public int compare(int a, int b) {
				System.out.println("in annonymous class compare "+a+", "+b);
				return 0;
			}
		};
	int c=ob1.compare(110,220);
	
	MyComparable ob2=(x,y)->{
		System.out.println("compare using lambda function"+x+","+y);
		return 0;
	};
	int x=ob2.compare(100,200);
	
	MyGenericClass<Integer> ob3=(x1,y1)->{
		return x1+y1;
	};
	System.out.println(ob3.compare(23,45));
	MyGenericClass<String> ob4=(x1,y1)->{
		return x1+y1;
	};
	System.out.println(ob3.compare(23,45));
	
	MyGeneric2<Integer>mg2=(a,b)->{
		return a+b+20;
	};
  }
}

