package easy.e0014longestcommonprefix.s01;

import org.junit.jupiter.api.Test;

import static common.VerifyUtil.verify;

public class LongestCommonPrefixTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        String[] input;
        String expect;
        String output;
        int seq = 0;

        input = new String[]{"geeksforgeeks", "geeks", "geezer"};
        expect = "gee";
        output = s.longestCommonPrefix(input);
        verify(expect, output, seq++);

        input = new String[]{"apple", "ape", "april"};
        expect = "ap";
        output = s.longestCommonPrefix(input);
        verify(expect, output, seq++);

        input = new String[]{};
        expect = "";
        output = s.longestCommonPrefix(input);
        verify(expect, output, seq++);
    }
}
