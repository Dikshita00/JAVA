package com.stringprocessor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StringProcessor {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		ArrayList<String> list3 = new ArrayList<>();
		
		System.out.println("number of strings you want to enter???");
		int n = sc.nextInt();
		
		for(int i = 0; i < 5; i++ ) {
			System.out.println("Enter string : ");
			String str = sc.nextLine();
			list1.add(str);
		}
		
		for( String str : list1 ) {
			if(str.length() > 5) {
				list2.add(str);
			}
			
			if(!str.isEmpty() ) {
				char ch = Character.toLowerCase(str.charAt(0));
				if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'||ch=='u') {
				list3.add(str);
			   }
			}
		}
		System.out.println("String with length >5 ");
		System.out.println(list2);
		
		System.out.println("String starting with vowel");
		System.out.println(list3);
		
		try {
			BufferedWriter bw1 = new BufferedWriter(new FileWriter("data1.txt"));
			for(String str : list2) {
				bw1.write(str);
				bw1.newLine();
			}
			bw1.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Error writing to daa1.txt");
		}
		
	}
	


}
