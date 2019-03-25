package medium.m0050powxn;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class PowexnTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        double x;
        int n;
        double expect;
        double output;
        int seq=1;

        x= 2.00000;
        n=10;
        expect= 1024.00000;
        output=s.myPow(x,n);
        VerifyUtil.verify(expect,output,seq++);

        x= 2.10000;
        n=3;
        expect= 9.26100;
        output=s.myPow(x,n);
        VerifyUtil.verify(expect,output,seq++);


        x= 2.00000;
        n=-2;
        expect= 0.25000;
        output=s.myPow(x,n);
        VerifyUtil.verify(expect,output,seq++);


    }
}
