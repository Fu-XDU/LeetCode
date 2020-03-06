/**
 * @author FuMing
 * @version 2019.7
 */
package com.hahaha.q;

public class HelloWorld {
	public static void main(String[] args) {
		Solution mySolution = new Solution();
		// for (int i = 1; i < 20; ++i)
		String[] S = {};
		System.out.println(mySolution.longestCommonPrefix(S));
	}
}

class Solution {
	public String longestCommonPrefix(String[] strs) {
		String ans = "";
		if (strs.length == 0)
			return ans;
		if (strs.length == 1)
			return strs[0];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < strs.length; ++i)
			if (strs[i].length() < min)
				min = strs[i].length();
		if (min == 0)
			return ans;
		for (int i = 0, q = 0; i < min; ++i) {
			char c = strs[0].charAt(q);
			for (int m = 1; m < strs.length; ++m) {
				if (strs[m].charAt(q) != c) {
					return ans;
				}
			}
			ans += c;
			++q;
			if (q == min)
				return ans;
		}
		return "";
	}
}