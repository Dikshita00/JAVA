package com.ibm.array;

//Problem Statement: You are given an array. The task is to reverse the array and print it.

public class Reverse {
	 public static void reverseArray(int[] arr) {
		 int p1=0;
		 int p2=arr.length-1;
		 while(p1<p2) {
			 int temp = arr[p1];
			 arr[p1] = arr[p2];
			 arr[p2] = temp;
			 p1++;
			 p2--;
		 }
	 }
		public static void main(String[] args) {
			Reverse rev=new Reverse();
			int[] arr= {1,2,3,4,5};
			rev.reverseArray(arr);
			for(int num : arr) {
				System.out.println(num + "");
			}
	}

}
