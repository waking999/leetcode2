package easy.e389findthedifference;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class FindtheDifferenceTest {
    @Test
    public   void test1( ) {
        Solution s = new Solution();

        String str1;
        String str2;
        char expect;
        char output;
        int seq=1;

        str1 = "abcd";
        str2 = "abcde";
        expect = 'e';
        output = s.findTheDifference(str1, str2);
        VerifyUtil.verify(expect,output,seq++);

        str1 = "abcd";
        str2 = "abecd";
        expect = 'e';
        output = s.findTheDifference(str1, str2);
        VerifyUtil.verify(expect,output,seq++);

        str1 = "abcd";
        str2 = "abadc";
        expect = 'a';
        output = s.findTheDifference(str1, str2);
        VerifyUtil.verify(expect,output,seq++);


    }
}
