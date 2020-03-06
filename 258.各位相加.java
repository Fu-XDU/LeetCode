/**
 * @author FuMing
 * @version 2019.7
 */
package com.hahaha.q;

public class HelloWorld {
	public static void main(String[] args) {
		Solution mySolution = new Solution();
		// for (int i = 1; i < 20; ++i)
		System.out.println(mySolution.addDigits(1919191));

	}
}

class Solution {
	public int addDigits(int num) {
		return (num - 1) % 9 + 1;
	}
}