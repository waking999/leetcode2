package easy.e0628maximumproductofyhreenumbers;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class MaximumProductofThreeNumbersTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int[] nums;
        int expect;
        int output;
        int seq = 1;

        nums = new int[]{1, 2, 3};
        expect = 6;
        output = s.maximumProduct(nums);
        VerifyUtil.verify(expect, output, seq++);

        nums = new int[]{1, 2, 3, 4};
        expect = 24;
        output = s.maximumProduct(nums);
        VerifyUtil.verify(expect, output, seq++);

        nums = new int[]{7, 0, 6, 4, 9, 6};
        expect = 378;
        output = s.maximumProduct(nums);
        VerifyUtil.verify(expect, output, seq++);

        nums = new int[]{2, 3, 4, 7, 0, 6, 4, 9, 6};
        expect = 378;
        output = s.maximumProduct(nums);
        VerifyUtil.verify(expect, output, seq++);

        nums = new int[]{-1, -2, 1, 2, 3};
        expect = 6;
        output = s.maximumProduct(nums);
        VerifyUtil.verify(expect, output, seq++);

        nums = new int[]{-4, -3, -2, -1, 60};
        expect = 720;
        output = s.maximumProduct(nums);
        VerifyUtil.verify(expect, output, seq++);


        nums = new int[]{-4, -3, -2, -2, -1};
        expect = -4;
        output = s.maximumProduct(nums);
        VerifyUtil.verify(expect, output, seq++);

        nums = new int[]{-4, 3, 2, 1, 60};
        expect = 360;
        output = s.maximumProduct(nums);
        VerifyUtil.verify(expect, output, seq++);
    }
}
