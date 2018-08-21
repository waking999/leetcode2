package easy.e0888faircandyswap.s01;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class FairCandySwapTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int[] A;
        int[] B;
        int[] expect;
        int[] output;
        int seq=1;

        A =new int []{1,1};
        B = new int []{2,2};
        expect=new int[]{1,2};
        output=s.fairCandySwap(A,B);
        VerifyUtil.verifyUnsort(expect,output,seq++);


        A =new int []{1,2};
        B = new int []{2,3};
        expect=new int[]{1,2};
        output=s.fairCandySwap(A,B);
        VerifyUtil.verifyUnsort(expect,output,seq++);


        A =new int []{2};
        B = new int []{1,3};
        expect=new int[]{2,3};
        output=s.fairCandySwap(A,B);
        VerifyUtil.verifyUnsort(expect,output,seq++);


        A =new int []{1,2,5};
        B = new int []{2,4};
        expect=new int[]{5,4};
        output=s.fairCandySwap(A,B);
        VerifyUtil.verifyUnsort(expect,output,seq++);



    }
}
