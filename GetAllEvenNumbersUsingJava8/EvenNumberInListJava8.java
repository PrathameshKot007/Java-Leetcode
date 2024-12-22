package com.practice.leetcode;

import java.util.Arrays;
import java.util.List;

public class EvenNumberInListJava8 {
	
	public static void main(String[] args) {
		EvenNumberInListJava8 even = new EvenNumberInListJava8();
		List<Integer> list = Arrays.asList(1,45,64,23,12,32);
		System.out.println(even.getAllEvenNumbers(list));
	}
	
	public List<Integer> getAllEvenNumbers(List<Integer> list){
		return list.stream().filter(s -> s%2==0).toList();
	}

}
