package easy.e0949largesttimeforgivendigits;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class LargestTimeForGivenDigits {
    @Test
    public void test1(){
        Solution s=new Solution();

        int[] A;
        String expect;
        String output;
        int seq=1;

        A=new int[]{1,2,3,4};
        expect="23:41";
        output=s.largestTimeFromDigits(A);
        VerifyUtil.verify(expect,output,seq++);


        A=new int[]{5,5,5,5};
        expect="";
        output=s.largestTimeFromDigits(A);
        VerifyUtil.verify(expect,output,seq++);

        A=new int[]{4,1,0,0};
        expect="14:00";
        output=s.largestTimeFromDigits(A);
        VerifyUtil.verify(expect,output,seq++);


        A=new int[]{1,9,6,0};
        expect="19:06";
        output=s.largestTimeFromDigits(A);
        VerifyUtil.verify(expect,output,seq++);
    }
}
