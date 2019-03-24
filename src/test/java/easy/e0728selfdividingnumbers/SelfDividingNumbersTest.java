package easy.e0728selfdividingnumbers;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SelfDividingNumbersTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int left;
        int right;
        int[] expect;
        List<Integer> output;
        int seq=1;

        left=1;
        right=22;
        expect=new int[]{1,2,3,4,5,6,7,8,9,11,12,15,22};
        output=s.selfDividingNumbers(left,right);
        VerifyUtil.verifyUnsort(expect,output,seq++);



    }
}
