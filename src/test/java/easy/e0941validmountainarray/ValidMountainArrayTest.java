package easy.e0941validmountainarray;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class ValidMountainArrayTest {
    @Test
    public void test1(){
        Solution s=new Solution();
        int[] A;
        boolean expect;
        boolean output;
        int seq=1;

        A=new int[]{2,1};
        expect=false;
        output=s.validMountainArray(A);
        VerifyUtil.verify(expect,output,seq++);


        A=new int[]{3,5,5};
        expect=false;
        output=s.validMountainArray(A);
        VerifyUtil.verify(expect,output,seq++);


        A=new int[]{0,3,2,1};
        expect=true;
        output=s.validMountainArray(A);
        VerifyUtil.verify(expect,output,seq++);


        A=new int[]{3,5,5,3};
        expect=false;
        output=s.validMountainArray(A);
        VerifyUtil.verify(expect,output,seq++);

        A=new int[]{};
        expect=false;
        output=s.validMountainArray(A);
        VerifyUtil.verify(expect,output,seq++);
    }
}
