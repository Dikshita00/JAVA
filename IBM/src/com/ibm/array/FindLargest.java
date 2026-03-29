package com.ibm.array;

//Find the largest number in an array

import java.util.Arrays;

public class FindLargest {
	public static int sortArray(int[] arr) {
		
		Arrays.sort(arr);
		return arr[4];
		
	}
	public static void main(String[] args) {
		
		int[] arr= {2,5,1,3,0};
		System.out.println("Largest element :"+sortArray(arr));
		
	}

}
