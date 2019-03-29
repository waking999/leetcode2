package medium.m0384shuffleanarray;


import java.util.Random;

public class Solution {
    int[] nums;
    int[] shuffleNums;
    Random random;

    public Solution(int[] nums) {
        this.nums = nums;
        shuffleNums = new int[nums.length];
        random = new Random();
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return this.nums;

    }


    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        if(nums.length==0){
            return nums;
        }

        shufflePos = 0;

        shuffle(0, shuffleNums.length - 1);
        return shuffleNums;
    }

    private int shufflePos;

    private void shuffle(int l, int r) {
        int p = random.nextInt(r - l + 1) + l;
        shuffleNums[shufflePos++] = nums[p];
        if (l == r) return;
        if (p > l) {
            shuffle(l, p - 1);
        }
        if (p < r) {
            shuffle(p + 1, r);
        }

    }
}
