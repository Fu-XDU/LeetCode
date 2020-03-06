/**
 * @author FuMing
 * @version 2019.7
 */
class Solution {
	static char chs[] = new char[26];
	static {
		for (int i = 0; i < chs.length; i++)
			chs[i] = (char) (65 + i);
	}

	public String convertToTitle(int n) {
		StringBuilder sb = new StringBuilder();
		if (n == 0)
			sb.append(chs[0]);
		while (n > 0) {
			int k = n % 26;
			if (k == 0)
				k = 26;
			sb.append(chs[k-1]);
			n = (n - k) / 26;
		}

		return sb.reverse().toString();

	}
}