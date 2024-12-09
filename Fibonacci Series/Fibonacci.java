package com.practice.leetcode;

import java.util.Arrays;

public class Fibonacci {
	
	public static void main(String[] args) {
		Fibonacci fb = new Fibonacci();
		System.out.println(Arrays.toString(fb.printFibb(5)));
	}
	
	//Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        //Your code here
        long[] result = new long[n];
        long first = 1;
        long second = 1;
        for(int i=0;i<n;i++) {
        	result[i] = first;
        	long next = first + second;
        	first = second;
        	second = next;
        }
        return result;
    }

}
