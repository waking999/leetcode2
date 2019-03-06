package easy.e0167twosumiiinputarrayissorted;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class TwoSumIIInputArrayIsSortedTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int[] nums;
        int target;
        int[] expect;
        int[] output;
        int seq = 1;

        nums = new int[]{2, 7, 11, 15};
        target = 9;
        expect = new int[]{1, 2};
        output = s.twoSum(nums, target);
        VerifyUtil.verifyUnsort(expect, output, seq++);

        nums = new int[]{2, 3,4};
        target = 6;
        expect = new int[]{1, 3};
        output = s.twoSum(nums, target);
        VerifyUtil.verifyUnsort(expect, output, seq++);

        nums = new int[]{-1,0};
        target = -1;
        expect = new int[]{1, 2};
        output = s.twoSum(nums, target);
        VerifyUtil.verifyUnsort(expect, output, seq++);


    }
}
