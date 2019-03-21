package easy.e1005maximizesumofarrayafterknegations;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class MaximizeSumOfArrayAfterKNegationsTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int[] A;
        int K;
        int expect;
        int output;
        int seq=1;

        A=new int[]{4,2,3};
        K=1;
        expect=5;
        output=s.largestSumAfterKNegations(A,K);
        VerifyUtil.verify(expect,output,seq++);

        A=new int[]{3,-1,0,2};
        K=3;
        expect=6;
        output=s.largestSumAfterKNegations(A,K);
        VerifyUtil.verify(expect,output,seq++);



        A=new int[]{2,-3,-1,5,-4};
        K=2;
        expect=13;
        output=s.largestSumAfterKNegations(A,K);
        VerifyUtil.verify(expect,output,seq++);


        A=new int[]{2,-3,-1,5,-4};
        K=7;
        expect=15;
        output=s.largestSumAfterKNegations(A,K);
        VerifyUtil.verify(expect,output,seq++);


        A=new int[]{-2,9,9,8,4};
        K=5;
        expect=32;
        output=s.largestSumAfterKNegations(A,K);
        VerifyUtil.verify(expect,output,seq++);
    }
}
