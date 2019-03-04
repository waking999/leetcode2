package easy.e0922sortarraybyparityii;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class SortArrayByParityIITest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int[] A;
        int[] expect;
        int[] output;
        int seq=1;

        A=new int[]{4,2,5,7};
        expect=new int[]{4,5,2,7};
        output=s.sortArrayByParityII(A);
        VerifyUtil.verifyUnsort(expect,output,seq++);

        A=new int[]{2,0,3,4,1,3};
        expect=new int[]{2,3,0,1,4,3};
        output=s.sortArrayByParityII(A);
        VerifyUtil.verifyUnsort(expect,output,seq++);
    }
}
