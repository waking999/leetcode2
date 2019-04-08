package medium.m0011containerwithmostwater;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class ContainerWithMostWaterTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int[] height;
        int expect;
        int output;
        int seq=1;

        height=new int[]{1,8,6,2,5,4,8,3,7};
        expect=49;
        output=s.maxArea(height);
        VerifyUtil.verify(expect,output,seq++);
    }
}
