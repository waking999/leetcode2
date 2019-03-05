package easy.e0908smallestrangei;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class SmallestRangeITest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int[] A;
        int K;
        int expect;
        int output;
        int seq = 1;

        A = new int[]{1};
        K = 0;
        expect = 0;
        output = s.smallestRangeI(A, K);
        VerifyUtil.verify(expect, output, seq++);

        A = new int[]{0, 10};
        K = 2;
        expect = 6;
        output = s.smallestRangeI(A, K);
        VerifyUtil.verify(expect, output, seq++);

        A = new int[]{1, 3, 6};
        K = 3;
        expect = 0;
        output = s.smallestRangeI(A, K);
        VerifyUtil.verify(expect, output, seq++);
    }
}
