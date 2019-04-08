package medium.m0011containerwithmostwater;

public class Solution {
    public int maxArea(int[] height) {
        int hLen = height.length;


        if (hLen == 2) {
            return Math.min(height[0], height[1]);
        }

        int l = 0;
        int r = hLen - 1;
        int maxArea = 0;

        while (l < r) {
            maxArea = Math.max(maxArea, (r - l) * Math.min(height[l], height[r]));
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }

        }


        return maxArea;
    }
}
