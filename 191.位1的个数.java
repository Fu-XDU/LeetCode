/**
 * @author FuMing
 * @version 2019.7
 */
package com.hahaha.q;

public class HelloWorld {
	public static void main(String[] args) {
		Solution mySolution = new Solution();
		System.out.println(mySolution.hammingWeight(-3));
	}
}
class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
    	int ans=0;
    	String str = "";
    	str+=Integer.toBinaryString(n)+"";
        String[] aStrings = str.split("");
        for(String ss:aStrings)
        	if(ss.equals("1"))
        		++ans;
        return ans;
    }
}