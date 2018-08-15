package easy.e0027removeelement.s01;

import org.junit.jupiter.api.Test;

import static common.VerifyUtil.verify;
import static common.VerifyUtil.verifyUnsort;
import static java.util.Arrays.copyOfRange;

public class RemoveElementTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int[] nums;
        int value;
        int[] expectNums;
        int expect;
        int output;
        int seq = 1;

        nums = new int[]{3, 2, 2, 3};
        value = 3;
        expectNums = new int[]{2, 2};
        expect = 2;
        output = s.removeElement(nums, value);
        verify(expect, output, seq++);
        verifyUnsort(expectNums, copyOfRange(nums, 0, output), seq++);

        nums = new int[]{1, 2, 2, 3, 2, 4};
        value = 2;
        expectNums = new int[]{1, 3, 4};
        expect = 3;
        output = s.removeElement(nums, value);
        verify(expect, output, seq++);
        verifyUnsort(expectNums, copyOfRange(nums, 0, output), seq++);

        nums = new int[]{};
        value = 2;
        expectNums = new int[]{};
        expect = 0;
        output = s.removeElement(nums, value);
        verify(expect, output, seq++);
        verifyUnsort(expectNums, copyOfRange(nums, 0, output), seq++);
    }


}
