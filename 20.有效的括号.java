/**
 * @author FuMing
 * @version 2019.7
 */
package com.hahaha.q;

import java.util.HashMap;
import java.util.Stack;

public class HelloWorld {
	public static void main(String[] args) {
		Solution mySolution = new Solution();
		// for (int i = 1; i < 20; ++i)
		String c = "()()";
		System.out.println(mySolution.isValid(c));
	}
}

class Solution {

	private HashMap<Character, Character> maps;

	public Solution() {
		this.maps = new HashMap<Character, Character>();//写入键值对
		maps.put(')', '(');
		maps.put(']', '[');
		maps.put('}', '{');
	}

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();//创建栈
		for (int i = 0; i < s.length(); ++i) {
			//如果是闭括号
			if (this.maps.containsKey(s.charAt(i))) {
				//如果栈空则一定返回false，如果栈非空则返回栈顶元素，如果栈顶元素不是所对应的开括号则返回false，否则什么都不做
				if ((stack.isEmpty() ? '#' : stack.pop()) != this.maps.get(s.charAt(i)))//
					return false;
			}
			//如果不是闭括号，那么将开括号压入栈顶
			else
				stack.push(s.charAt(i));
		}
		//如果栈空，则说明括号匹配成功，否则匹配失败
		return stack.isEmpty();
	}
}
//String 对象的public char charAt(int index)方法用于返回字符串位于第index位的字符
//学会HashMap对象的建立，public V put(K key, V value)、public boolean containsKey(Object key)、public V get(Object key)等方法的使用
//学会栈的创建方法，public E push(E item)、public synchronized E pop()、public synchronized boolean isEmpty()等方法的使用