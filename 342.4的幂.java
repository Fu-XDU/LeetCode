/**
 * @author FuMing
 * @version 2019.7
 */
package com.hahaha.q;

public class HelloWorld {
	public static void main(String[] args) {
		Solution mySolution = new Solution();
		for (int i = 1; i < 20; ++i)
			System.out.println(mySolution.isPowerOfFour(((int)Math.pow(4, i))));

	}
}

class Solution {
	public boolean isPowerOfFour(int n) {
		int ans = 0;
		String str = "";
		str += Integer.toBinaryString(n) + "";
		//System.out.println(str);
		String[] aStrings = str.split("");
		if (aStrings[0].equals("1")) {
			for (int i = 1; i < aStrings.length; ++i) {
				if (aStrings[i].equals("0")==false)
					return false;
				else
					++ans;
			}
		} else
			return false;
		if (ans % 2 == 0)
			return true;
		else
			return false;
	}
}