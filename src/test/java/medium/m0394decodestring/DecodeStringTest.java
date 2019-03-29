package medium.m0394decodestring;

import org.junit.jupiter.api.Test;

import static common.VerifyUtil.verify;

public class DecodeStringTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        String str;
        String expect;
        String output;
        int seq = 1;


//        str = "3[a]2[bc]";
//        expect = "aaabcbc";
//        output = s.decodeString(str);
//        verify(expect, output, seq++);
//
//        str = "3[a2[c]]";
//        expect = "accaccacc";
//        output = s.decodeString(str);
//        verify(expect, output, seq++);
//
//        str = "2[abc]3[cd]ef";
//        expect = "abcabccdcdcdef";
//        output = s.decodeString(str);
//        verify(expect, output, seq++);
//
//        str = "12[abc]3[cd]ef";
//        expect = "abcabcabcabcabcabcabcabcabcabcabcabccdcdcdef";
//        output = s.decodeString(str);
//        verify(expect, output, seq++);
//
//
//        str = "abc3[cd]ef";
//        expect = "abccdcdcdef";
//        output = s.decodeString(str);
//        verify(expect, output, seq++);


//        str = "3[a]2[b4[F]c]";
//        expect = "aaabFFFFcbFFFFc";
//        output = s.decodeString(str);
//        verify(expect, output, seq++);

        str ="3[z]2[2[y]pq4[2[jk]e1[f]]]ef";
        expect = "zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef";
        output = s.decodeString(str);
        verify(expect, output, seq++);

    }
}
