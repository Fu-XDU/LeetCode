/**
 * @author FuMing
 * @version 2019.7
 */
package com.hahaha.q;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HelloWorld {
	public static void main(String[] args) {
		Solution mySolution = new Solution();
		// for (int i = 1; i < 20; ++i)
		int[] s = {1,1,1,1};
		int[] q = { 2,2,2,2,1};
		mySolution.intersection(s, q);
	}
}

class Solution {
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> nums1Set = new HashSet<>();
		Set<Integer> ans = new HashSet<>();
		for (int i : nums1)
			nums1Set.add(i);
		for (int i : nums2)
			if (nums1Set.contains(i))
				ans.add(i);
		int[] res = new int[ans.size()];
		Iterator<Integer> it = ans.iterator();
		int i = 0;
		while (it.hasNext()) {
			res[i] = it.next();
			++i;
		}
		return res;
	}
}
//Set集合可以存放任意多个不重复元素，有查询元素的方法