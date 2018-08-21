package easy.e0053maximumsubarray.s01;

public class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int maxSoFar = Math.max(0, nums[0]); // maximum ending at i - 1
        for (int i = 1; i < nums.length; ++i) {
            maxSoFar += nums[i];
            maxSum = Math.max(maxSum, maxSoFar);
            if (maxSoFar < 0)
                maxSoFar = 0; // empty array is better
        }
        return maxSum;
    }
}
