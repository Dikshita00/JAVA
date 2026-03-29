package com.ibm.array;

import java.util.Arrays;

//Find the smallest element in an array

public class FindSmallest {
	public static int sortArray(int[] arr) {
		Arrays.sort(arr);
		return arr[0];
		
	}
	public static void main(String[] args) {
		int[] arr= {2,5,1,3,0};
		System.out.println("The smallest element in the arrat is :"+sortArray(arr));
	}

}
