package com.day8.string;

import java.util.stream.Stream;

public class StringFunction {
	public static void main(String[] args) {
		String str="rain in spain in plain";
		System.out.println("matches:"+str.matches(".*a.*n.*"));
		String s1="Happy Birthday";
		System.out.println("matcges with :"+s1.matches(".*day$"));
		boolean r=str.isBlank();
		System.out.println(r);
		str="";
		r=str.isBlank();
		System.out.println(r);
		str="testing \n is a \r technical \n portal";
		
		Stream<String> line = str.lines();
		line.forEach(System.out::println);
		String str1="  hello  ";
		
		System.out.println("using strip "+str1.strip());
		System.out.println("using stripleading " +str1.stripLeading());
		System.out.println("using stripTrailing "+ str1.stripTrailing());
	}

}
