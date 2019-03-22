package easy.e0581shortestunsortedcontinuoussubarray;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class ShortestUnsortedContinuousSubarray {
    @Test
    public void test1() {
        Solution s = new Solution();

        int[] nums;
        int expect;
        int output;
        int seq = 1;

        nums = new int[]{2, 6, 4, 8, 10, 9, 15};
        expect = 5;
        output = s.findUnsortedSubarray(nums);
        VerifyUtil.verify(expect, output, seq++);


        nums = new int[]{1, 2, 3, 4};
        expect = 0;
        output = s.findUnsortedSubarray(nums);
        VerifyUtil.verify(expect, output, seq++);

        nums = new int[]{1, 3, 2, 2, 2};
        expect = 4;
        output = s.findUnsortedSubarray(nums);
        VerifyUtil.verify(expect, output, seq++);

        nums = new int[]{1, 2, 3, 3, 3};
        expect = 0;
        output = s.findUnsortedSubarray(nums);
        VerifyUtil.verify(expect, output, seq++);
    }
}
