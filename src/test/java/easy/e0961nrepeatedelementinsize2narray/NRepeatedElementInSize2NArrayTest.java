package easy.e0961nrepeatedelementinsize2narray;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class NRepeatedElementInSize2NArrayTest {
    @Test
    public void test1(){
        Solution s=new Solution();
        int[] A;
        int expect;
        int output;
        int seq=1;

        A=new int[]{1,2,3,3};
        expect=3;
        output=s.repeatedNTimes(A);
        VerifyUtil.verify(expect,output,seq++);

        A=new int[]{2,1,2,5,3,2};
        expect=2;
        output=s.repeatedNTimes(A);
        VerifyUtil.verify(expect,output,seq++);

        A=new int[]{5,1,5,2,5,3,5,4};
        expect=5;
        output=s.repeatedNTimes(A);
        VerifyUtil.verify(expect,output,seq++);

        A=new int[]{2,6,2,1};
        expect=2;
        output=s.repeatedNTimes(A);
        VerifyUtil.verify(expect,output,seq++);

    }
}
