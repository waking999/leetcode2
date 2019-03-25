package easy.e0868binarygap;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class BinaryGapTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int N;
        int expect;
        int output;
        int seq = 1;

        N = 22;
        expect = 2;
        output = s.binaryGap(N);
        VerifyUtil.verify(expect, output, seq++);


        N = 5;
        expect = 2;
        output = s.binaryGap(N);
        VerifyUtil.verify(expect, output, seq++);

        N = 6;
        expect = 1;
        output = s.binaryGap(N);
        VerifyUtil.verify(expect, output, seq++);

        N = 8;
        expect = 0;
        output = s.binaryGap(N);
        VerifyUtil.verify(expect, output, seq++);
    }
}
