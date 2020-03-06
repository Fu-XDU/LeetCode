/**
 * @author FuMing
 * @version 2019.7
 */
package com.hahaha.q;

import java.math.*;

public class HelloWorld {
	public static void main(String[] args) {
		Solution mySolution = new Solution();
	    for(int i=0;i<1001;++i)
		System.out.println(i+":"+mySolution.trailingZeroes(i));
	}
}

class Solution {
	public int trailingZeroes(int n) {
		int q = 0, ans = 0;
		for (q = 0; Math.pow(5.0, q) <= n; ++q) {
		}
		--q;
		for (int i = 0; i < q; ++i)
			ans += (n - n % (int) Math.pow(5.0, 1 + i)) / (int) Math.pow(5.0, 1 + i);
		return ans;
	}
}