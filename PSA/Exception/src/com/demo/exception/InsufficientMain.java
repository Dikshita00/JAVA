package com.demo.exception;

import java.util.Scanner;

public class InsufficientMain {
	public static void main(String[] args) {
		int balance=250;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		int amount=sc.nextInt();
		
		if(balance<amount) {
			try { //throw keyword is use to throw custom exception
				throw new InsufficientFunds("Low Balance");
			} catch (InsufficientFunds e) {
				System.out.println(e.getMessage());
			}
		}else {
			System.out.println("Please collect cash!!");
		}
		
		
	}

}
