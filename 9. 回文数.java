/**
 * @author FuMing
 * @version 2019.7
 */
class Solution {
	public boolean isPalindrome(int x) {
		char[] array =String.valueOf(x).toCharArray();
		for(int n=0;n<array.length/2;n++)
			if(array[n]!=array[array.length-n-1])
				return false;
		return true;
	}
}