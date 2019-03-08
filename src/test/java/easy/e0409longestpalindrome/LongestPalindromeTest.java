package easy.e0409longestpalindrome;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class LongestPalindromeTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        String str;
        int expect;
        int output;
        int seq = 1;

        str = "abccccdd";
        expect = 7;
        output = s.longestPalindrome(str);
        VerifyUtil.verify(expect, output, seq++);

        str = "ccc";
        expect = 3;
        output = s.longestPalindrome(str);
        VerifyUtil.verify(expect, output, seq++);

        str = "AAAAAA";
        expect = 6;
        output = s.longestPalindrome(str);
        VerifyUtil.verify(expect, output, seq++);
    }
}
