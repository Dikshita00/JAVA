package com.demo.jdbc_concept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CrudOperation {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			// connect to DB
			
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/june10","root","root");
			System.out.println(con);
			
			//perform sql query
			
			Statement stmnt=con.createStatement();
			//create record
			stmnt.executeUpdate("insert into student values('diksh','diksh@gmail.com','6978968')");
			stmnt.executeUpdate("insert into student values('kol','kol@gmail.com','9999999')");
			
			//remove record
			stmnt.executeUpdate("delete from student where name='josh'");
			
			//update
			stmnt.executeUpdate("update student set mobile='11111111' where name='mike'");
			
			//Retrieve record
			ResultSet result  = stmnt.executeQuery("select * from student");
			while(result.next()) {
			    System.out.println(result.getString("name"));
			    System.out.println(result.getString("email"));
			    System.out.println(result.getString("mobile"));
			}

			//close database connection
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
