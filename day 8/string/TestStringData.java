package com.day8.string;

public class TestStringData {
	public static void main(String[] args) {
		String str1="Book";
		String str2="Book";
		String s=new String("Bus");
		String s1=new String("Books");
		System.out.println("str1==str2 "+(str1==str2));
		System.out.println("str1==s "+(str1==s));
		System.out.println("str1==s1 "+str1==s1);
		System.out.println("str1==s1 "+(str1.equals(s1)));
		
		StringBuffer sbf=new StringBuffer("Hello");
		System.out.println(sbf.append("World"));
		
		StringBuilder sb=new StringBuilder("Cool");
		System.out.println(sb.append(s));
		
		String s6="xxx,yyy,zzz-rrrr";
		String[] arr=s6.split(",");
		String str=String.join(":", arr);
		System.out.println(str);
	}

}
