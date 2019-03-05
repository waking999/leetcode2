package easy.e0917reverseonlyletters;


import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class ReverseOnlyLettersTest {
    @Test
    public void test1() {
        Solution s=new Solution();

        String str;
        String output;
        String expect;
        int seq=1;

        str="ab-cd";
        expect="dc-ba";
        output=s.reverseOnlyLetters(str);
        VerifyUtil.verify(expect,output,seq++);

        str="a-bC-dEf-ghIj";
        expect="j-Ih-gfE-dCba";
        output=s.reverseOnlyLetters(str);
        VerifyUtil.verify(expect,output,seq++);


        str="Test1ng-Leet=code-Q!";
        expect="Qedo1ct-eeLg=ntse-T!";
        output=s.reverseOnlyLetters(str);
        VerifyUtil.verify(expect,output,seq++);

        str="7_28]";
        expect="7_28]";
        output=s.reverseOnlyLetters(str);
        VerifyUtil.verify(expect,output,seq++);

        str="?6C40E";
        expect="?6E40C";
        output=s.reverseOnlyLetters(str);
        VerifyUtil.verify(expect,output,seq++);
    }

}
