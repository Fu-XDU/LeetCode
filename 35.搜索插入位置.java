/**
 * @author FuMing
 * @version 2019.7
 */
package com.hahaha.q;

public class HelloWorld {
	public static void main(String[] args) {
		Solution mySolution = new Solution();
		int[] nums = { 1, 3, 5, 6 };
		System.out.println(mySolution.searchInsert(nums, 0));
	}
}

class Solution {

	public int searchInsert(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			// 与中间值比较确定在左边还是右边区间,以调整区域
			if (target > nums[mid]) {
				low = mid + 1;
			} else if (target < nums[mid]) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return low;
	}
}
