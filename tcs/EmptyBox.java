package com.tcs;

import java.util.*;

public class EmptyBox {
    public static void main(String[] args) {

        // Hardcoded array (so console input is not needed)
        int[] arr = {0, 5, 0, 3, 8};  
        int n = arr.length;

        int pos = 0; // position to place next non-zero element

        // Move non-zero elements to the front
        for (int num : arr) {
            if (num != 0) {
                arr[pos++] = num;
            }
        }

        // Fill remaining positions with zero
        while (pos < n) {
            arr[pos++] = 0;
        }

        // Print the final array
        System.out.println("Result:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}