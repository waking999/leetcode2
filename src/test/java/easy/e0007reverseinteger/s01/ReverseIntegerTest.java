package easy.e0007reverseinteger.s01;


import org.junit.jupiter.api.Test;

import static common.VerifyUtil.verify;

public class ReverseIntegerTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int x;
        int expect;
        int output;
        int seq = 0;

        x = 123;
        expect = 321;
        output = s.reverse(x);
        verify(expect, output, seq++);

        x = -123;
        expect = -321;
        output = s.reverse(x);
        verify(expect, output, seq++);

        x = 1534236469;
        expect = 0;
        output = s.reverse(x);
        verify(expect, output, seq++);

    }
}
