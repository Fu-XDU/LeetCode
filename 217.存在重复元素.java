/**
 * @author FuMing
 * @version 2019.7
 */
package com.hahaha.q;

import java.util.Arrays;

public class HelloWorld {
	public static void main(String[] args) {
		Solution mySolution = new Solution();
		// for (int i = 1; i < 20; ++i)
		int[] a = { 1,2,3,1 };
		System.out.println(mySolution.containsDuplicate(a));

	}
}

class Solution {
	public boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length-1; ++i)
			if (nums[i] == nums[i + 1])
				return true;
		return false;
	}
}