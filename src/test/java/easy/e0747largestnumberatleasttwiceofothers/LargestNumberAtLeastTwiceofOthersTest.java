package easy.e0747largestnumberatleasttwiceofothers;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class LargestNumberAtLeastTwiceofOthersTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int[] nums;
        int expect;
        int output;
        int seq=1;

        nums=new int[]{3,6,1,0};
        expect=1;
        output=s.dominantIndex(nums);
        VerifyUtil.verify(expect,output,seq++);

        nums=new int[]{1,2,3,4};
        expect=-1;
        output=s.dominantIndex(nums);
        VerifyUtil.verify(expect,output,seq++);

        nums=new int[]{0,0,0,1};
        expect=3;
        output=s.dominantIndex(nums);
        VerifyUtil.verify(expect,output,seq++);

    }
}
