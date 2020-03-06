/**
 * @author FuMing
 * @version 2019.7
 */
package com.hahaha.q;

public class HelloWorld {
	public static void main(String[] args) {
		Solution mySolution = new Solution();
		// for (int i = 0; i < 15; ++i)
		System.out.println(mySolution.isPowerOfTwo(1024));

	}
}

class Solution {
	public boolean isPowerOfTwo(int n) {
		if (n == -2147483648)// -2147483648的二进制为10000000000000000000000000000000但是他不是2的幂
			return false;
		String str = Integer.toBinaryString(n) + "";
		// System.out.println(str);
		String[] aStrings = str.split("");
		if (aStrings[0].equals("1")) {
			for (int i = 1; i < aStrings.length; ++i)
				if (!aStrings[i].equals("0"))
					return false;
		} else
			return false;
		return true;
	}
}