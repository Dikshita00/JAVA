package com.demo.jdbc_concept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class CrudOperationExceptValueFromUser {
	
	public static void main(String[] args) {
		
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name :");
			String name=sc.next();
			
			System.out.println("Enter email :");
			String email=sc.next();
			
			System.out.println("Enter contact no.:");
			String mobile=sc.next();
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/june10","root","root");
			
			Statement stmnt=con.createStatement();
			stmnt.executeUpdate("INSERT INTO student VALUES ('" + name + "', '" + email + "', '" + mobile + "')");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
	