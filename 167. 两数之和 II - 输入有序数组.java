/**
 * @author FuMing
 * @version 2019.7
 */
class Solution {
	public int[] twoSum(int[] numbers, int target) {
		int[] ans = { 1, 2 };
		int q = 0;
		if (numbers.length == 2)
			return ans;
		if (target < numbers[numbers.length - 1]) {
			for (int i = 0; i < numbers.length; ++i)
				if ((numbers[i] < target || numbers[i] == target)
						&& (numbers[i + 1] > target || numbers[i + 1] == target)) {
					q = i;
					break;
				}
			for (int i = 0; i < q; ++i) {
				for (int j = i+1; j < q+1; ++j)
					if (numbers[i] + numbers[j] == target) {
						ans[0] = i < j ? i + 1 : j + 1;
						ans[1] = i < j ? j + 1 : i + 1;
						;
						return ans;
					}
			}
		} else {
			for (int i = numbers.length - 1; i > 0; --i) {
				for (int j = 0; j < i; ++j)
					if (numbers[i] + numbers[j] == target) {
						ans[0] = i < j ? i + 1 : j + 1;
						ans[1] = i < j ? j + 1 : i + 1;
						return ans;
					}
			}
		}
		return ans;
	}
}