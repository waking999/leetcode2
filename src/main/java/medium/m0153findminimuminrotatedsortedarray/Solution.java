package medium.m0153findminimuminrotatedsortedarray;

public class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return nums[0];
        } else if (n == 2) {
            return Math.min(nums[0], nums[1]);
        }

        int l = 0;
        int r = n - 1;
        while (l < r - 1) {
            if (nums[l] < nums[r]) {
                return nums[l];
            }
            int m = l + (r - l) / 2;
            if (nums[m] > nums[l]) {
                l = m;
            } else   {
                r = m;
            }
        }

        return Math.min(nums[l], nums[r]);
    }
}
