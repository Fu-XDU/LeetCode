/**
 * @author FuMing
 * @version 2019.7
 */
class Solution {
	public void duplicateZeros(int[] arr) {
		int[] temp = new int[arr.length];
		for (int i = 0, q = 0; i < arr.length; ++i) {
			if (arr[i] != 0) {
				if (q < arr.length)
					temp[q] = arr[i];
				else
					break;
				++q;
			} else {
				if (q < arr.length)
					temp[q] = 0;
				else
					break;
				if (q + 1 < arr.length)
					temp[q + 1] = 0;
				q += 2;
			}
		}
		for (int i = 0; i < arr.length; ++i)
			arr[i] = temp[i];
	}
}