/**
 * @author FuMing
 * @version 2019.7
 */
package com.hahaha.q;

import java.util.HashSet;

public class HelloWorld {
	public static void main(String[] args) {
		Solution mySolution = new Solution();
		int[] nums = { -3, -1, 0, 0, 0, 3, 3 };
		System.out.println(mySolution.removeDuplicates(nums));
	}
}

class Solution {
	public int removeDuplicates(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		int q = 0;
		for (int i : nums)
			if (!set.contains(i)) {
				set.add(i);
				nums[q] = i;
				++q;
			}
		return q;
	}
}