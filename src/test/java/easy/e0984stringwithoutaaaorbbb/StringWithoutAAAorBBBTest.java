package easy.e0984stringwithoutaaaorbbb;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class StringWithoutAAAorBBBTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int A;
        int B;
        String expect;
        String output;
        int seq=1;

        A=1;
        B=2;
        //expect="abb";
        //expect="bab";
        expect="bba";
        output=s.strWithout3a3b(A,B);
        VerifyUtil.verify(expect,output,seq++);


        A=4;
        B=1;
        expect="aabaa";
        output=s.strWithout3a3b(A,B);
        VerifyUtil.verify(expect,output,seq++);

        A=2;
        B=2;
        expect="abab";
        output=s.strWithout3a3b(A,B);
        VerifyUtil.verify(expect,output,seq++);


        A=3;
        B=4;
        expect="bbababa";
        output=s.strWithout3a3b(A,B);
        VerifyUtil.verify(expect,output,seq++);

        A=3;
        B=5;
        expect="bbabbaba";
        output=s.strWithout3a3b(A,B);
        VerifyUtil.verify(expect,output,seq++);

        A=4;
        B=6;
        expect="bbabbababa";
        output=s.strWithout3a3b(A,B);
        VerifyUtil.verify(expect,output,seq++);

        A=4;
        B=7;
        expect="bbabbabbaba";
        output=s.strWithout3a3b(A,B);
        VerifyUtil.verify(expect,output,seq++);


        A=27;
        B=33;
        expect="bbabbabbabbabbabbabababababababababababababababababababababa";
        output=s.strWithout3a3b(A,B);
        VerifyUtil.verify(expect,output,seq++);

    }
}
