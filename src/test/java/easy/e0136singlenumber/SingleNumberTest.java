package easy.e0136singlenumber;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class SingleNumberTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int[] nums;
        int expect;
        int output;
        int seq = 1;


        nums = new int[]{2, 2, 1};
        expect = 1;
        output = s.singleNumber(nums);
        VerifyUtil.verify(expect, output, seq++);


        nums = new int[]{4, 1, 2, 1, 2};
        expect = 4;
        output = s.singleNumber(nums);
        VerifyUtil.verify(expect, output, seq++);


    }
}
