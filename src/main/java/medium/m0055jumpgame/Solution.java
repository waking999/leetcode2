package medium.m0055jumpgame;

public class Solution {
    public boolean canJump(int[] nums) {
        // init 0 to cover {0}
        int farthest = 0;
        for (int i = 0; i < nums.length; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            // if there is no way to go further stop the loop
            if (farthest == i && nums[i] == 0) {
                break;
            } else if (farthest >= nums.length - 1) {
                return true;
            }
        }

        return farthest >= nums.length - 1;
    }



}
