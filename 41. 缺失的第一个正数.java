/**
 * @author FuMing
 * @version 2019.7
 */
class Solution {
	public int firstMissingPositive(int[] nums) {
		if(nums.length==0)
			return 1;
		int[] res = new int[nums.length+1];
		for (int j = 0; j < nums.length-1; j++)
			for (int i = j+1; i < nums.length; i++)
				if(nums[i] ==nums[j])
					nums[j]=0;
		for (int j = 0, t = 0; j < nums.length-1; j++)
			for (int i = 0; i < nums.length - j-1; i++)
			{
				if (nums[i] > nums[i + 1]) {
					t = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = t;
				}
			}
		for (int i = 0, t = 1; i < nums.length; i++)
			if (nums[i] > 0) {
				res[t] = nums[i];
				t++;
			}
		for (int i = 1; i < res.length; i++)
			if (i != res[i])
				return i;
		return res.length;
	}
}