/**
 * @author FuMing
 * @version 2019.7
 */
package com.hahaha.q;

public class HelloWorld {
	public static void main(String[] args) {
		Solution mySolution = new Solution();
		int[] nums = { 1, 2, 3, 4, 4, 4, 5, 6, 6, 7, 0 };
		System.out.println(mySolution.removeElement(nums, 4));
	}
}

class Solution {
	public int removeElement(int[] nums, int val) {
		int b = 0;
		int[] ans = new int[nums.length];
		for (int i : nums)
			if (i != val) {
				ans[b] = i;
				++b;
			}
		for (int i = 0; i < b; ++i)
			nums[i] = ans[i];
		for (int i = 0; i < b; ++i)
			System.out.println(nums[i]);
		return b;
	}
}