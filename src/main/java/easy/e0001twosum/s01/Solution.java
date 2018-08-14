package easy.e0001twosum.s01;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sumMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (sumMap.containsKey(num)) {
                int pos = sumMap.get(num);
                return new int[] { pos, i };
            } else {
                sumMap.put(target - num, i);
            }

        }
        return null;
    }
}
