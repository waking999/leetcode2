package easy.e0219containsduplicateii;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0) return false;
        int p1 = 0;
        int p2 = 0;
        while (p1 < nums.length) {
            if (p1 != p2 && nums[p1] == nums[p2]) {
                return true;
            }
            if (p2 < nums.length - 1 && p2 - p1 < k) {
                p2++;
            } else {
                p1++;
            }
        }

        return false;
    }
}
