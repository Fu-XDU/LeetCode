/**
 * @author FuMing
 * @version 2019.7
 */
class Solution {
	public int reverse(int x) {
		if(x==-2147483648)
			return 0;
		long temp=(long)x;
		temp=temp<0?-temp:temp;
		String s = "1";
		s = String.valueOf(temp);
		char[] array = s.toCharArray();
		char[] ans = s.toCharArray();
		for (int i = 0; i < s.length(); i++)
			ans[i] = array[s.length() - 1 - i];
		long res = Long.parseLong(String.valueOf(ans));
		if (x < 0 && res < 2147483647)
			return (int)-res;
		else if (x > 0 && res < 2147483647)
			return (int)res;
		else
			return 0;
	}
}