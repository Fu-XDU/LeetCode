/**
 * @author FuMing
 * @version 2019.7
 */
package com.hahaha.q;

public class HelloWorld {
	public static void main(String[] args) {
		Solution mySolution = new Solution();
		// int[] nums = { 1, 2, 3, 4, 4, 4, 5, 6, 6, 7, 0 };
		String S = "a";
		String T = "";
		System.out.println(mySolution.strStr(S, T));
	}
}

class Solution {
	public int strStr(String haystack, String needle) {
		if (needle.length() == 0)
			return 0;
		for (int i = 0; i < haystack.length(); ++i)
			if (haystack.charAt(i) == needle.charAt(0)) {
				if (needle.length() > 1) {
					if (haystack.length()-i>=needle.length()) {
						for (int q = i; q < needle.length() + i; ++q) {
							if (haystack.charAt(q) != needle.charAt(q - i))
								break;
							else if (haystack.charAt(q) == needle.charAt(needle.length() - 1)
									&& q == needle.length() + i - 1)
								return i;
						}
					}
					else return -1;
				} else if (needle.length() == 1)
					return i;
			}
		return -1;
	}
}