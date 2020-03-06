/**
 * @author FuMing
 * @version 2019.7
 */
package com.hahaha.q;

public class HelloWorld {
	public static void main(String[] args) {
		Solution mySolution = new Solution();
		int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		mySolution.rotate(nums);
	}
}

class Solution {
	public void rotate(int[][] matrix) {
		for (int i = 0; i < matrix.length; ++i)
			for (int j = i + 1; j < matrix.length; ++j) {
				matrix[i][j] = matrix[i][j] ^ matrix[j][i];
				matrix[j][i] = matrix[i][j] ^ matrix[j][i];
				matrix[i][j] = matrix[i][j] ^ matrix[j][i];
			}
		for (int j = 0; j < matrix.length / 2; ++j)
			for (int i = 0; i < matrix.length; ++i) {
				matrix[i][j] = matrix[i][j] ^ matrix[i][matrix.length - j - 1];
				matrix[i][matrix.length - j - 1] = matrix[i][j] ^ matrix[i][matrix.length - j - 1];
				matrix[i][j] = matrix[i][j] ^ matrix[i][matrix.length - j - 1];
			}
	}
}
