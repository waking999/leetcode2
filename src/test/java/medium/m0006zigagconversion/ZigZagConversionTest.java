package medium.m0006zigagconversion;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class ZigZagConversionTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        String str;
        int numRows;
        String expect;
        String output;
        int seq = 1;

        str = "PAYPALISHIRING";
        numRows = 3;
        expect = "PAHNAPLSIIGYIR";
        output = s.convert(str, numRows);
        VerifyUtil.verify(expect, output, seq++);


        str = "PAYPALISHIRING";
        numRows = 4;
        expect = "PINALSIGYAHRPI";
        output = s.convert(str, numRows);
        VerifyUtil.verify(expect, output, seq++);

        str = "AB";
        numRows = 1;
        expect = "AB";
        output = s.convert(str, numRows);
        VerifyUtil.verify(expect, output, seq++);

    }
}
