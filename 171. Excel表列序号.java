/**
 * @author FuMing
 * @version 2019.7
 */
class Solution {
	public int titleToNumber(String s) {
		int f = 1;
		int sum = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			sum += (s.charAt(i) - 64) * f;
			f *= 26;
		}
		return sum;
	}
}