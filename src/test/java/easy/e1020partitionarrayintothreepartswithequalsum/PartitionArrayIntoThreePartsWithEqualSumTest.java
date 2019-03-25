package easy.e1020partitionarrayintothreepartswithequalsum;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class PartitionArrayIntoThreePartsWithEqualSumTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int[] A;
        boolean expect;
        boolean output;
        int seq=1;

        A=new int[]{0,2,1,-6,6,-7,9,1,2,0,1};
        expect=true;
        output=s.canThreePartsEqualSum(A);
        VerifyUtil.verify(expect,output,seq++);

        A=new int[]{0,2,1,-6,6,7,9,-1,2,0,1};
        expect=false;
        output=s.canThreePartsEqualSum(A);
        VerifyUtil.verify(expect,output,seq++);

        A=new int[]{3,3,6,5,-2,2,5,1,-9,4};
        expect=true;
        output=s.canThreePartsEqualSum(A);
        VerifyUtil.verify(expect,output,seq++);

        A=new int[]{14,6,-10,2,18,-7,-4,11};
        expect=false;
        output=s.canThreePartsEqualSum(A);
        VerifyUtil.verify(expect,output,seq++);
    }
}
