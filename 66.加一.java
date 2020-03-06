/**
 * @author FuMing
 * @version 2019.7
 */
package com.hahaha.q;

public class HelloWorld {
	public static void main(String[] args) {
		Solution mySolution = new Solution();
		int[] nums = { 0 };
		mySolution.plusOne(nums);
	}
}

class Solution {
	public int[] plusOne(int[] digits) {
		int flag = 0;
		for (int i : digits)
			if (i != 9) {
				flag = 1;
				break;
			}
		if (flag == 1) {
			++digits[digits.length - 1];
			for (int i = digits.length - 1; i > -1; --i) {
				if (digits[i] > 9) {
					digits[i] -= 10;
					digits[i - 1] += 1;
				} else
					break;
			}
		}
		if (flag == 0) {
			int[] ans = new int[digits.length + 1];
			ans[0] = 1;
			return ans;
		}
		return digits;

	}
}
