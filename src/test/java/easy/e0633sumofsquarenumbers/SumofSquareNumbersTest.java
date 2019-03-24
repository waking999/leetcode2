package easy.e0633sumofsquarenumbers;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class SumofSquareNumbersTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int c;
        boolean expect;
        boolean output;

        c = 5;
        expect = true;
        output = s.judgeSquareSum(c);
        VerifyUtil.verify(expect, output, 1);
    }
}
