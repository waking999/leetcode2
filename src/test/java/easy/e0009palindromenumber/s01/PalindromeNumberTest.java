package easy.e0009palindromenumber.s01;

import org.junit.jupiter.api.Test;

import static common.VerifyUtil.verify;

public class PalindromeNumberTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int x;
        boolean expect;
        boolean output;
        int seq = 0;

        x = 0;
        expect = true;
        output = s.isPalindrome(x);
        verify(expect, output, seq++);

        x = -1;
        expect = false;
        output = s.isPalindrome(x);
        verify(expect, output, seq++);

        x = 121;
        expect = true;
        output = s.isPalindrome(x);
        verify(expect, output, seq++);

        x = 122;
        expect = false;
        output = s.isPalindrome(x);
        verify(expect, output, seq++);


    }

}
