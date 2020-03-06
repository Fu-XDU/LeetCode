/**
 * @author FuMing
 * @version 2019.7
 */
class Solution {
	public int hammingDistance(int x, int y) {
		int temp = x ^ y,count = 0;
		while (temp != 0) {
			temp &=(temp - 1);
			++count;
		}
		return count;
	}
}