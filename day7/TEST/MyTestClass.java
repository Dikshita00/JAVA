package com.day7.TEST;

public class MyTestClass {
	
	public int max(int a, int b) {
        return Math.max(a, b);
    }

    public int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public float max(float a, float b) {
        return Math.max(a, b);
    }

    public String max(String a, String b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int... nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return sum;
    }

}
