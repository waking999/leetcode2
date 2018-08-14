package easy.e0001twosum.s01;


import org.junit.jupiter.api.Test;

import static common.VerifyUtil.verifyUnsort;

public class TwoSumTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int[] nums;
        int target;
        int[] expect;
        int[] output;
        int seq = 1;

        nums = new int[]{-3, 4, 3, 90};
        target = 0;
        expect = new int[]{0, 2};
        output = s.twoSum(nums, target);
        verifyUnsort(expect, output, seq++);


        nums = new int[]{1, 2};
        target = 0;
        expect = null;
        output = s.twoSum(nums, target);
        verifyUnsort(expect, output, seq++);
    }
}
