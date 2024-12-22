package com.practice.leetcode;

public class Factorial {
	public static void main(String[] args) {
		Factorial fac = new Factorial();
		System.out.println(fac.findFacotialOf(5));
	}
	
	public int findFacotialOf(int n) {
		if(n==1) {
			return 1;
		}
		return n*findFacotialOf(n-1);
	}
}
