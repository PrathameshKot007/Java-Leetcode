package com.practice.leetcode;

import java.util.Arrays;

public class IsPalindrome {
	public static void main(String[] args) {
		IsPalindrome ip = new IsPalindrome();
		System.out.println(ip.isPalindrome("race a car"));
	}

	public boolean isPalindrome(String s) {
		s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		String[] splitter = s.split("");
		String comparator = "";
		for(int i=splitter.length-1;i>=0;i--) {
			comparator += splitter[i];
		}
		if(s.equalsIgnoreCase(comparator))
			return true;
		else 
			return false;
	}
}
