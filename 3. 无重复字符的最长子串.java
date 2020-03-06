/**
 * @author FuMing
 * @version 2019.7
 */
class Solution {
	public int lengthOfLongestSubstring(String s) {
		char[] array = s.toCharArray();
		int max = 0, temp = 0;
		if (s.length() != 1)
			loop0: for (int i = 0; i < s.length(); i++)// 起始指针
				loop: for (int n = i + 1; n < s.length(); n++)// 终止指针
				{
					temp = 1;
					for (int t = i; t < n; t++)// 查重指针
					{
						if (array[t] == array[n])// 查重
						{
							temp = n - i;
							if (temp > max)
								max = temp;
							break loop;
						} else
							temp++;
						if (temp > max)
							max = temp;
						if (t == s.length() - 1)
							break loop0;
					}
				}
		else
			return 1;
		if (temp > max)
			max = temp;
		return max;
	}
}