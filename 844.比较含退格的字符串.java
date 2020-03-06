/**
 * @author FuMing
 * @version 2019.7
 */
package com.hahaha.q;

//import java.util.HashMap;
import java.util.Stack;

public class HelloWorld {
	public static void main(String[] args) {
		Solution mySolution = new Solution();
		// for (int i = 1; i < 20; ++i)
		String S = "ab#c", T = "ad#c";//'#'表示退格
		System.out.println(mySolution.backspaceCompare(S, T));
	}
}

class Solution {
	public boolean backspaceCompare(String S, String T) {
		Stack<Character> SS = new Stack<Character>();
		Stack<Character> ST = new Stack<Character>();
		for (int i = 0; i < S.length(); ++i) {
			char c = S.charAt(i);
			if (c != '#')
				SS.push(c);
			else if(c=='#'&&!SS.isEmpty())
				SS.pop();
				
		}
		for (int i = 0; i < T.length(); ++i) {
			char c = T.charAt(i);
			if (c != '#')
				ST.push(c);
			else if(c=='#'&&!ST.isEmpty())
				ST.pop();
		}
		if (SS.size() != ST.size())
			return false;
		else
			for (int i = 0; i < SS.size(); ++i)
				if (!SS.pop().equals(ST.pop()))
					return false;
		return true;

	}
}