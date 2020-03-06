/**
 * @author FuMing
 * @version 2019.7
 */
package com.hahaha.q;

import java.util.HashMap;

public class HelloWorld {
	public static void main(String[] args) {
		Solution mySolution = new Solution();
		String nums = "race car";
		System.out.println(mySolution.wordPattern("a", ""));
	}
}

class Solution {
	private HashMap<String, String> maps = new HashMap<String, String>();

	public boolean wordPattern(String pattern, String str) {
		String[] patternString = pattern.split("");
		String[] strString = str.split(" ");
		System.out.println(patternString.length + " " + strString.length);
		if (patternString.length != strString.length||(pattern.equals("")&&!str.equals(""))||(!pattern.equals("")&&str.equals("")))
			return false;
		for (int i = 0; i < pattern.length(); ++i) {
			if (!maps.containsKey(patternString[i]) && !maps.containsValue(strString[i]))// 没k没v
				maps.put(patternString[i], strString[i]);
			else if ((maps.containsKey(patternString[i]) && !strString[i].equals(maps.get(patternString[i])))
					|| (maps.containsValue(strString[i]) && !maps.containsKey(patternString[i])))
				return false;
		}
		return true;
	}
}
