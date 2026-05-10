package com.emo.connectioninexception;
/*
 * difference between final finally finalize
 * > final makes variable constant
 * > final prevent overriding of code
 * > final on class stops inheritance 
 * 
 * >finally is extentention of try catch block
 * >the code that we write in finally block will run 100% regardless exception
 * 
 * finalize()
 * >this is method inside object class and here garbage collection logic is implemented
 * >we can try calling garbage collector using System.gc() but will not guarantee 100% execution
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class A {
	public static void main(String[] args)  {
		Connection conn=null;

		try {
			conn = DriverManager.getConnection("mysql:jdbc://localhost:3306/june10","root","root");
			Statement stmnt=conn.createStatement();
			stmnt.executeUpdate("insertssss into student value('diksh','diksh@gmail.com','99999999')");
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("finally");
		}
		System.out.println("welcome");
	}

}
