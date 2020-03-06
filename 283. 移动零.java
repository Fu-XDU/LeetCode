/**
 * @author FuMing
 * @version 2019.7
 */
class Solution {
	public void moveZeroes(int[] nums) {
		int []b=new int [nums.length];
		int q=0;
		for (int i = 0; i < nums.length; ++i)
			if (nums[i] != 0) {
				b[q]=nums[i];
				++q;
			}
		for(int i=0;i<q;++i)
			nums[i]=b[i];
		for(int i=q;i<nums.length;++i)
			nums[i]=0;
	}
}