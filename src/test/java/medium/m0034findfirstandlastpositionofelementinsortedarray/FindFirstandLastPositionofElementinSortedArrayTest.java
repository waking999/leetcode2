package medium.m0034findfirstandlastpositionofelementinsortedarray;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class FindFirstandLastPositionofElementinSortedArrayTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int[] nums;
        int target;
        int[] expect;
        int[] output;
        int seq = 1;

        nums = new int[]{5, 7, 7, 8, 8, 10};
        target = 8;
        expect = new int[]{3, 4};
        output = s.searchRange(nums, target);
        VerifyUtil.verifyUnsort(expect, output, seq++);


        nums = new int[]{5, 7, 7, 8, 8, 10};
        target = 6;
        expect = new int[]{-1, -1};
        output = s.searchRange(nums, target);
        VerifyUtil.verifyUnsort(expect, output, seq++);

        nums = new int[]{2,2};
        target = 2;
        expect = new int[]{0, 1};
        output = s.searchRange(nums, target);
        VerifyUtil.verifyUnsort(expect, output, seq++);
    }
}
