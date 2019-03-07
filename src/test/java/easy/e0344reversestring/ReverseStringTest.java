package easy.e0344reversestring;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        String str;
        char[] chars;
        String expectStr;
        char[] expect;
        int seq = 1;

        str = "hello";
        chars=str.toCharArray();
        expectStr = "olleh";
        expect=expectStr.toCharArray();
        s.reverseString(chars);
        VerifyUtil.verifyUnsort(expect, chars, seq++);



        str = "helo";
        chars=str.toCharArray();
        expectStr = "oleh";
        expect=expectStr.toCharArray();
        s.reverseString(chars);
        VerifyUtil.verifyUnsort(expect, chars, seq++);
    }
}
