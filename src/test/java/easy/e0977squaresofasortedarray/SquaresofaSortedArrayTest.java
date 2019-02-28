package easy.e0977squaresofasortedarray;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class SquaresofaSortedArrayTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int[] A;
        int[] expect;
        int[] output;
        int seq=1;

        A=new int[]{-4,-1,0,3,10};
        expect=new int[]{0,1,9,16,100};
        output=s.sortedSquares(A);
        VerifyUtil.verifyUnsort(expect,output,seq++);

        A=new int[]{-7,-3,2,3,11};
        expect=new int[]{4,9,9,49,121};
        output=s.sortedSquares(A);
        VerifyUtil.verifyUnsort(expect,output,seq++);
    }
}
