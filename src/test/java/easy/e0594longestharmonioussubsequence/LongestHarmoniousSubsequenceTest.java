package easy.e0594longestharmonioussubsequence;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class LongestHarmoniousSubsequenceTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int[] nums;
        int expect;
        int output;
        int seq = 1;

        nums = new int[]{1, 3, 2, 2, 5, 2, 3, 7};
        expect = 5;
        output = s.findLHS(nums);
        VerifyUtil.verify(expect, output, seq++);


        nums = new int[]{1, 3, 2, 2, 5, 2, 3, 7, 7, 7, 7, 7, 7, 7, 7, 8};
        expect = 9;
        output = s.findLHS(nums);
        VerifyUtil.verify(expect, output, seq++);


        nums = new int[]{1, 1, 1, 1};
        expect = 0;
        output = s.findLHS(nums);
        VerifyUtil.verify(expect, output, seq++);
    }
}
