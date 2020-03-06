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
		System.out.println(mySolution.isIsomorphic("egg", "ade"));
	}
}

class Solution {
	private HashMap<String, String> maps = new HashMap<String, String>();

	public boolean isIsomorphic(String s, String t) {
		String[] ss = s.split("");
		String[] st = t.split("");
		if (ss.length != st.length || (s.equals("") && !t.equals("")) || (!s.equals("") && t.equals("")))
			return false;
		for (int i = 0; i < s.length(); ++i) {
			if (!maps.containsKey(ss[i]) && !maps.containsValue(st[i]))// 没k没v
				maps.put(ss[i], st[i]);
			else if ((maps.containsKey(ss[i]) && !st[i].equals(maps.get(ss[i])))
					|| (maps.containsValue(st[i]) && !maps.containsKey(ss[i])))
				return false;
		}
		return true;
	}
}
