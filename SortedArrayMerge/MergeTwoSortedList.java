package com.practice.leetcode;

import java.util.Arrays;

public class MergeTwoSortedList {
	
	public static void main(String[] args) {
		MergeTwoSortedList mTwoSort = new MergeTwoSortedList();
		int nums1[] = {1,2,3,0,0,0};
		int nums2[] = {2,5,6};
		mTwoSort.merge(nums1, 3, nums2, 3);
	}
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length==(m+n)) {
        	for(int i=0;i<nums1.length;i++) {
        		for(int j=0; j<n;j++) {
        			if((nums1[i]+nums2[j])==nums2[j] && nums2[j]!=0) {
        				nums1[i] = nums2[j];
        				nums2[j] = 0;
        				continue;
        			}
        		}
        	}
        }
        Arrays.sort(nums1);
        for(int i: nums1)
        System.out.println(i);
    }

}
