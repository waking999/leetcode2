package easy.e1413minimumvaluetogetpositivestepbystepsum;

public class Solution {
	public int minStartValue(int[] nums) {

		int len = nums.length;
		int dp = nums[0];
		int min = dp;
		for (int i = 1; i < len; i++) {
			dp = dp + nums[i];
			min = Math.min(min, dp);
		}
		return min <= 0 ? 1 - min : 1;

	}
}
