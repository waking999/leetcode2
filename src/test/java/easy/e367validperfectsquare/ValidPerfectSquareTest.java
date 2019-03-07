package easy.e367validperfectsquare;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class ValidPerfectSquareTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int num;
        boolean expect;
        boolean output;
        int seq = 1;

        num = 16;
        expect = true;
        output = s.isPerfectSquare(num);
        VerifyUtil.verify(expect, output, seq++);

        num = 14;
        expect = false;
        output = s.isPerfectSquare(num);
        VerifyUtil.verify(expect, output, seq++);

        num = 49;
        expect = true;
        output = s.isPerfectSquare(num);
        VerifyUtil.verify(expect, output, seq++);

        num = 808201;
        expect = true;
        output = s.isPerfectSquare(num);
        VerifyUtil.verify(expect, output, seq++);


    }
}
