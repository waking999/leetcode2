package medium.m0055jumpgame;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class JumpGameTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int[] nums;
        boolean expect;
        boolean output;
        int seq=1;

        nums=new int[]{2,3,1,1,4};
        expect=true;
        output=s.canJump(nums);
        VerifyUtil.verify(expect,output,seq++);

        nums=new int[]{3,2,1,0,4};
        expect=false;
        output=s.canJump(nums);
        VerifyUtil.verify(expect,output,seq++);

        nums=new int[]{3,2,1};
        expect=true;
        output=s.canJump(nums);
        VerifyUtil.verify(expect,output,seq++);

        nums=new int[]{1,1,1,0};
        expect=true;
        output=s.canJump(nums);
        VerifyUtil.verify(expect,output,seq++);


        nums=new int[]{1,1,1,1};
        expect=true;
        output=s.canJump(nums);
        VerifyUtil.verify(expect,output,seq++);

        nums=new int[]{1,2};
        expect=true;
        output=s.canJump(nums);
        VerifyUtil.verify(expect,output,seq++);

        nums=new int[]{1,2,3};
        expect=true;
        output=s.canJump(nums);
        VerifyUtil.verify(expect,output,seq++);

        nums=new int[]{1,1,2,2,0,1,1};
        expect=true;
        output=s.canJump(nums);
        VerifyUtil.verify(expect,output,seq++);
    }
}
