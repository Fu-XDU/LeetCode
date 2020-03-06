/**
 * @author FuMing
 * @version 2019.7
 */
package com.hahaha.q;

public class HelloWorld {
	public static void main(String[] args) {
		Solution mySolution = new Solution();
		for (int i = 1; i < 20; ++i)
			System.out.println(mySolution.isPowerOfThree((int)Math.pow(3, i)));

	}
}
class Solution {
    public boolean isPowerOfThree(int n) {
    	if(n<1)
    		return false;
        return 1162261467%n==0?true:false;
    }
}