package easy.e0459repeatedsubstringpattern;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class RepeatedSubstringPatternTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        String str;
        boolean expect;
        boolean output;
        int seq=1;

        str = "abab";
        expect = true;
        output = s.repeatedSubstringPattern(str);
        VerifyUtil.verify(expect, output, seq++);

        str = "aba";
        expect = false;
        output = s.repeatedSubstringPattern(str);
        VerifyUtil.verify(expect, output, seq++);

        str = "abcabcabcabc";
        expect = true;
        output = s.repeatedSubstringPattern(str);
        VerifyUtil.verify(expect, output, seq++);

    }
}
