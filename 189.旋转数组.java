/**
 * @author FuMing
 * @version 2019.7
 */
package com.hahaha.q;

public class HelloWorld {
	public static void main(String[] args) {
		Solution mySolution = new Solution();
		int[] nar = { 1, 2, 3, 4 ,4,4,5,6,7,8,9,3,90,0,0,0};
		// for (int i = 0; i < 1001; ++i)
		mySolution.rotate(nar, 9);
		// mySolution.reverseWords(" eee 333 rR ");
	}
}

class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        for(int i:nums)
        	System.out.println(i);
    }
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
}