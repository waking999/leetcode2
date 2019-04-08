package medium.m0005longestpalindromicsubstring;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class LongestPalindromicSubstringTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        String str;
        String expect;
        String output;
        int seq=1;

        str= "babad";
        expect= "bab";
        output=s.longestPalindrome(str);
        VerifyUtil.verify(expect,output,seq++);

        str= "cbbd";
        expect= "bb";
        output=s.longestPalindrome(str);
        VerifyUtil.verify(expect,output,seq++);

        str= "";
        expect= "";
        output=s.longestPalindrome(str);
        VerifyUtil.verify(expect,output,seq++);

        str= "abacab";
        expect= "bacab";
        output=s.longestPalindrome(str);
        VerifyUtil.verify(expect,output,seq++);



        str= "aaabaaaa";
        expect= "aaabaaa";
        output=s.longestPalindrome(str);
        VerifyUtil.verify(expect,output,seq++);

    }
}
