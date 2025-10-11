package com.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assignment1 {

    // Check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    // Calculate factorial
    static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        List<Integer> primes = new ArrayList<>();
        List<Integer> oddNonPrimes = new ArrayList<>();

        // Identify primes and odd non-primes
        System.out.println("\nPrime numbers in the array:");
        for (int num : arr) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                primes.add(num);
            } else if (num % 2 != 0) {
                oddNonPrimes.add(num);
            }
        }

        // Sum of odd non-primes
        int oddNonPrimeSum = 0;
        for (int num : oddNonPrimes)
            oddNonPrimeSum += num;
        System.out.println("\n\nSum of odd non-prime numbers: " + oddNonPrimeSum);

        // Factorials of numbers less than 7
        System.out.println("\nFactorials of numbers < 7:");
        for (int num : arr) {
            if (num < 7 && num >= 0) {
                System.out.println("Factorial of " + num + " = " + factorial(num));
            }
        }

        // Sort primes and find nth max/min
        Collections.sort(primes);
        if (primes.size() > 0) {
            System.out.print("\nEnter value of n for nth MAX and MIN prime number: ");
            int nth = sc.nextInt();
            if (nth <= primes.size()) {
                int nthMaxPrime = primes.get(primes.size() - nth);
                int nthMinPrime = primes.get(nth - 1);
                System.out.println(nth + "th Max Prime: " + nthMaxPrime);
                System.out.println(nth + "th Min Prime: " + nthMinPrime);
            } else {
                System.out.println("Not enough prime numbers for nth max/min.");
            }
        } else {
            System.out.println("\nNo prime numbers in the array.");
        }

        sc.close();
    }
}
