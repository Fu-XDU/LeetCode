/**
 * @author FuMing
 * @version 2019.7
 */
package com.hahaha.q;

public class HelloWorld {
	public static void main(String[] args) {
		Solution mySolution = new Solution();
		System.out.println(mySolution.reverseWords("  helloee    world! eee      "));
	}
}

class Solution {
	public String reverseWords(String s) {
		String ans="";
		String [] arr = s.split("\\s+");
		if(arr.length==0)
			return "";
		for(int i=arr.length-1;i>(arr[0].equals("")?0:-1);--i) {
			ans+=arr[i];
			if(i!=(arr[0].equals("")?1:0))
				ans+=" ";
		}
		return ans;
	}
}