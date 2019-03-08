package easy.e0884uncommonwordsfromtwosentences;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class UncommonWordsfromTwoSentencesTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        String A;
        String B;
        String[] expect;
        String[] output;
        int seq=1;

        A = "this apple is sweet";
        B = "this apple is sour";
        expect=new String[]{"sweet","sour"};
        output=s.uncommonFromSentences(A,B);
        VerifyUtil.verifySort(expect,output,seq++);

        A = "apple apple";
        B = "banana";
        expect=new String[]{"banana"};
        output=s.uncommonFromSentences(A,B);
        VerifyUtil.verifySort(expect,output,seq++);

        A = "apple apple";
        B = "apple banana";
        expect=new String[]{"banana"};
        output=s.uncommonFromSentences(A,B);
        VerifyUtil.verifyUnsort(expect,output,seq++);

    }
}
