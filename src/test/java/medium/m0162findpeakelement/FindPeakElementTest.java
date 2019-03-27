package medium.m0162findpeakelement;

import org.junit.jupiter.api.Test;

import static common.VerifyUtil.verify;

public class FindPeakElementTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int[] nums;
        int expect;
        int output;
        int seq = 1;

        nums = new int[]{4, 1, 5, 6, 2, 3};
        expect = 3;
        output = s.findPeakElement(nums);
        verify(expect, output, seq++);

        nums = new int[]{3, 4, 3, 2, 1};
        expect = 1;
        output = s.findPeakElement(nums);
        verify(expect, output, seq++);

        nums = new int[]{1};
        expect = 0;
        output = s.findPeakElement(nums);
        verify(expect, output, seq++);

        nums = new int[]{1,2};
        expect = 1;
        output = s.findPeakElement(nums);
        verify(expect, output, seq++);


        nums = new int[]{3,2,1};
        expect = 0;
        output = s.findPeakElement(nums);
        verify(expect, output, seq++);

        nums = new int[]{1,3,2,1};
        expect = 1;
        output = s.findPeakElement(nums);
        verify(expect, output, seq++);
    }
}
