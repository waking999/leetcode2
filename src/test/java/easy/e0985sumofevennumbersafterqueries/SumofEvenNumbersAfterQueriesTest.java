package easy.e0985sumofevennumbersafterqueries;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class SumofEvenNumbersAfterQueriesTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int[] A;
        int[][] queries;
        int[] expect;
        int[] output;
        int seq=1;

        A=new int[]{1,2,3,4};
        queries=new int[][]{{1,0},{-3,1},{-4,0},{2,3}};
        expect=new int[]{8,6,2,4};
        output=s.sumEvenAfterQueries(A,queries);
        VerifyUtil.verifyUnsort(expect,output,seq++);


    }
}
