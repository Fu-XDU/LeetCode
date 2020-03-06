/**
 * @author FuMing
 * @version 2019.7
 */
class Solution {
	public int findDuplicate(int[] nums) {
		for (int j = 0; j < nums.length-1; j++)
			for (int i = j+1; i < nums.length; i++)
				if(nums[i] ==nums[j])
					return nums[i];
		return 0;
	}
}