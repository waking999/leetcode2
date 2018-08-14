package easy.e0020validparentheses.s01;

import org.junit.jupiter.api.Test;

import static common.VerifyUtil.verify;

public class ValidParenthesesTest {

    @Test
    public void test1() {
        Solution s = new Solution();

        String str;
        boolean expect;
        boolean output;
        int seq = 0;

        str = "()";
        expect = true;
        output = s.isValid(str);
        verify(expect, output, seq++);

        str = "()[]{}";
        expect = true;
        output = s.isValid(str);
        verify(expect, output, seq++);

        str = "(]";
        expect = false;
        output = s.isValid(str);
        verify(expect, output, seq++);

        str = "([)]";
        expect = false;
        output = s.isValid(str);
        verify(expect, output, seq++);

        str = "[])";
        expect = false;
        output = s.isValid(str);
        verify(expect, output, seq++);

        str = null;
        expect = true;
        output = s.isValid(str);
        verify(expect, output, seq++);

        str = "";
        expect = true;
        output = s.isValid(str);
        verify(expect, output, seq++);


    }
}
