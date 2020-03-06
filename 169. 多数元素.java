/**
 * @author FuMing
 * @version 2019.7
 */
package com.hahaha.q;

import java.util.Arrays;

public class HelloWorld {
	public static void main(String[] args) {
		int[] nums = {2,3,4,4,2,2,33,443,4,54,12,21,21};
		Solution mySolution = new Solution();
		mySolution.majorityElement(nums);
	}
}

class Solution {
	public void majorityElement(int[] nums) {
		Arrays.sort(nums);
		for(int i:nums)
			System.out.print(i+" ");
	}
}