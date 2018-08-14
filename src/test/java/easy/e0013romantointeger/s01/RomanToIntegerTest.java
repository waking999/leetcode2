package easy.e0013romantointeger.s01;

import org.junit.jupiter.api.Test;

import static common.VerifyUtil.verify;

public class RomanToIntegerTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        String str;
        int expect;
        int output;
        int seq = 0;

        str = "I";
        expect = 1;
        output = s.romanToInt(str);
        verify(expect, output, seq++);

        str = "IX";
        expect = 9;
        output = s.romanToInt(str);
        verify(expect, output, seq++);

        str = "XII";
        expect = 12;
        output = s.romanToInt(str);
        verify(expect, output, seq++);

        str = null;
        expect = -1;
        output = s.romanToInt(str);
        verify(expect, output, seq++);



        str = "";
        expect = -1;
        output = s.romanToInt(str);
        verify(expect, output, seq++);

        str = "M";
        expect = 1000;
        output = s.romanToInt(str);
        verify(expect, output, seq++);

        str = "D";
        expect = 500;
        output = s.romanToInt(str);
        verify(expect, output, seq++);

        str = "C";
        expect = 100;
        output = s.romanToInt(str);
        verify(expect, output, seq++);


        str = "L";
        expect = 50;
        output = s.romanToInt(str);
        verify(expect, output, seq++);

        str = "V";
        expect = 5;
        output = s.romanToInt(str);
        verify(expect, output, seq++);

        str = "A";
        expect = -1;
        output = s.romanToInt(str);
        verify(expect, output, seq++);

    }
}
