package easy.e0053maximumsubarray.s01;

import org.junit.jupiter.api.Test;

import static common.VerifyUtil.verify;


public class MaximumSubarrayTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int[] nums;
        int expect;
        int output;
        int seq = 0;

        nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        expect = 6;
        output = s.maxSubArray(nums);
        verify(expect, output, seq++);

        nums = new int[]{-2, 1};
        expect = 1;
        output = s.maxSubArray(nums);
        verify(expect, output, seq++);

        nums = new int[]{1};
        expect = 1;
        output = s.maxSubArray(nums);
        verify(expect, output, seq++);

        nums = new int[]{-1};
        expect = -1;
        output = s.maxSubArray(nums);
        verify(expect, output, seq++);

        nums = new int[]{-2, -1};
        expect = -1;
        output = s.maxSubArray(nums);
        verify(expect, output, seq++);

    }
}
