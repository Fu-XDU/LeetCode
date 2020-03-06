/**
 * @author FuMing
 * @version 2019.7
 */
class Solution {
	public void reverseString(char[] s) {
		char temp;
		if (s.length % 2 == 0)
			for (int i = 0; i < s.length / 2; ++i) {
				temp = s[i];
				s[i] = s[s.length - i - 1];
				s[s.length - i - 1] = temp;
			}
		else if (s.length % 2 == 1)
			for (int i = 0; i < (s.length - 1) / 2; ++i) {
				temp = s[i];
				s[i] = s[s.length - i - 1];
				s[s.length - i - 1] = temp;
			}
	}
}