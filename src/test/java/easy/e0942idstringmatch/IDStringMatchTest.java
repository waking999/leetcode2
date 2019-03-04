package easy.e0942idstringmatch;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class IDStringMatchTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        String S;
        int[] expect;
        int[] output;
        int seq=1;



        S="IDID";
        expect=new int[]{0,4,1,3,2};
        output=s.diStringMatch(S);
        VerifyUtil.verifyUnsort(expect,output,seq++);

        S="III";
        expect=new int[]{0,1,2,3};
        output=s.diStringMatch(S);
        VerifyUtil.verifyUnsort(expect,output,seq++);

        S="DDI";
       expect=new int[]{3,2,0,1};
        output=s.diStringMatch(S);
        VerifyUtil.verifyUnsort(expect,output,seq++);



        S="DIIIDDIDDDDDDDDIDIDI";
        expect=new int[]{20,0,1,2,19,18,3,17,16,15,14,13,12,11,10,4,9,5,8,6,7};
        output=s.diStringMatch(S);
        VerifyUtil.verifyUnsort(expect,output,seq++);



    }
}
