/**
 * @author FuMing
 * @version 2019.7
 */
class Solution {
	public int myAtoi(String str) {
		if(str.equals("")||str.equals("-")||str.equals("+"))
			return 0;
		int start = 0, flag = 0;
		String[] temp = str.split("");
		for (int i = 0; i < temp.length; i++) {
			if (temp[i].equals(" "))
				++start;
			else
				break;
		}
		if (start == temp.length)
			return 0;
		if (temp[start].equals("-")&&"0123456789".indexOf(temp[start+1]) >= 0) {
			flag = -1;
			++start;
		} else if ("0123456789".indexOf(temp[start]) >= 0)
			flag = 1;
		if(temp[start].equals("+")&&"0123456789".indexOf(temp[start+1]) >= 0) {
			flag=1;
			++start;
		}
		if (flag != 0) {
			int end = start;
			for (int i = start; i < temp.length; i++) {
				if ("0123456789".indexOf(temp[i]) >= 0)
					++end;
				else
					break;
			}
			String string = "";
			if (flag == -1)
				string += "-";
			for (int i = start; i < end; ++i)
				string += temp[i];
			try {
				return Integer.parseInt(string);
			} catch (Exception e) {
				if(flag==-1)
					return -2147483648;
				else if(flag==1)
					return 2147483647;
			}
		} else if (flag == 0)
			return 0;
		return 0;
	}
}