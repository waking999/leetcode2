package easy.e0169majorityelement;


public class Solution {
    public int majorityElement(int[] nums) {
        int c = nums[0], count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == c) count++;
            else count--;
            if (count < 1) {
                c = nums[i];
                count = 1;
            }
        }
        return c;
    }
}
