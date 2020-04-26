package easy.e0896monotonicarray.s01;

import org.junit.jupiter.api.Test;

import common.VerifyUtil;
 

public class MonotonicArrayTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int[] A;
        boolean expect;
        boolean output;
        int seq=1;


        A=new int[]{1,2,2,3};
        expect=true;
        output=s.isMonotonic(A);
        VerifyUtil.verify(expect,output,seq++);


        A=new int[]{6,5,4,4};
        expect=true;
        output=s.isMonotonic(A);
        VerifyUtil.verify(expect,output,seq++);

        A=new int[]{1,3,2};
        expect=false;
        output=s.isMonotonic(A);
        VerifyUtil.verify(expect,output,seq++);

        A=new int[]{1,2,4,5};
        expect=true;
        output=s.isMonotonic(A);
        VerifyUtil.verify(expect,output,seq++);

        A=new int[]{1,1,1};
        expect=true;
        output=s.isMonotonic(A);
        VerifyUtil.verify(expect,output,seq++);

    }
}
