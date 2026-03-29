package com.ibm.array;

import java.util.Arrays;

//Second Smallest and Second Largest element in an array
/* Problem Statement: Given an array, find the second smallest and second largest element 
in the array. Print ‘-1’ in the event that either of them doesn’t exist. */

public class SecondSmallestAndLargest {
	
	public static void getEements(int[] arr, int n) {
		if(n==0 || n==1) {
			System.out.println(-1 + " " + -1);
			return;
		}
		Arrays.sort(arr);
		int small = arr[1];
		int large = arr[n-2]; 
		
		System.out.println("Second smallest is " + small);
		System.out.println("Second largest is " + large);
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,4,6,7,5};
		int n=arr.length;
		SecondSmallestAndLargest.getEements(arr, n);
	}
	

}
