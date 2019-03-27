package hard.h0154findminimuminrotatedsortedarrayii;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class FindMinimuminRotatedSortedArrayIITest {
    @Test
    public  void test1(){
        Solution s=new Solution();

        int[] nums;
        int expect;
        int output;
        int seq=1;

        nums=new int[]{1,3,5};
        expect=1;
        output=s.findMin(nums);
        VerifyUtil.verify(expect,output,seq++);

        nums=new int[]{2,2,2,0,1};
        expect=0;
        output=s.findMin(nums);
        VerifyUtil.verify(expect,output,seq++);

    }
}
