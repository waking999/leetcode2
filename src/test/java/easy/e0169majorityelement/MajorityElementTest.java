package easy.e0169majorityelement;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class MajorityElementTest {
    @Test
    public void test1(){
        Solution s=new Solution();


        int[] nums;
        int expect;
        int output;
        int seq=1;

        nums=new int[]{3,2,3};
        expect=3;
        output=s.majorityElement(nums);
        VerifyUtil.verify(expect,output,seq++);



        nums=new int[]{2,2,1,1,1,2,2};
        expect=2;
        output=s.majorityElement(nums);
        VerifyUtil.verify(expect,output,seq++);

        nums=new int[]{1};
        expect=1;
        output=s.majorityElement(nums);
        VerifyUtil.verify(expect,output,seq++);


        nums=new int[]{2,2,3,2,1,1,1,1};
        expect=1;
        output=s.majorityElement(nums);
        VerifyUtil.verify(expect,output,seq++);
    }
}
