package com.demo.exception.toll;

import java.util.Scanner;

public class BlackLisedMain {
	public static void main(String[] args) {
		int balance=300;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		int amount=sc.nextInt();
		if(balance<amount) {
			try {
				throw new BlackListed("Low Balance");
			} catch (BlackListed e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
		}else {
				System.out.println("Open the gate");
			}
		}
	}

