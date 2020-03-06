/**
 * @author FuMing
 * @version 2019.7
 */
package com.hahaha.q;

public class HelloWorld {
	public static void main(String[] args) {
		Solution mySolution = new Solution();
		int[] nums = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(mySolution.maxArea(nums));
	}
}

class Solution {
	public int maxArea(int[] height) {
		int i = 0, j = height.length - 1, max = 0;
		while (i != j) {
			max = max > (j - i) * (height[i] > height[j] ? height[j] : height[i]) ? max
					: (j - i) * (height[i] > height[j] ? height[j] : height[i]);
			if (height[i] > height[j])
				--j;
			else
				++i;
		}
		return max;
	}
}