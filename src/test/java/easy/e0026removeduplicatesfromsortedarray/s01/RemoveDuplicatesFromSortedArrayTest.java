package easy.e0026removeduplicatesfromsortedarray.s01;

import org.junit.jupiter.api.Test;

import static common.VerifyUtil.verify;
import static common.VerifyUtil.verifyUnsort;
import static java.util.Arrays.copyOfRange;

public class RemoveDuplicatesFromSortedArrayTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int[] nums;
        int[] expectNums;
        int expect;
        int output;
        int seq = 1;

        nums = new int[]{2, 2, 3, 3};
        expectNums = new int[]{2, 3};
        expect = 2;
        output = s.removeDuplicates(nums);
        verify(expect, output, seq++);
        verifyUnsort(expectNums, copyOfRange(nums, 0, output), seq++);

        nums = new int[]{1, 2, 2, 2, 3, 4};
        expectNums = new int[]{1, 2, 3, 4};
        expect = 4;
        output = s.removeDuplicates(nums);
        verify(expect, output, seq++);
        verifyUnsort(expectNums, copyOfRange(nums, 0, output), seq++);

        nums = new int[]{};
        expectNums = new int[]{};
        expect = 0;
        output = s.removeDuplicates(nums);
        verify(expect, output, seq++);
        verifyUnsort(expectNums, copyOfRange(nums, 0, output), seq++);


    }
}
