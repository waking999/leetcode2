package easy.e0476bumbercomplement;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class NumberComplementTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int num;
        int expect;
        int output;
        int seq = 1;

        num = 5;
        expect = 2;
        output = s.findComplement(num);
        VerifyUtil.verify(expect, output, seq++);

        num = 1;
        expect = 0;
        output = s.findComplement(num);
        VerifyUtil.verify(expect, output, seq++);

        num = 2;
        expect = 1;
        output = s.findComplement(num);
        VerifyUtil.verify(expect, output, seq++);

    }


}
