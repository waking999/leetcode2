package easy.e0989addtoarrayformofinteger;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AddtoArrayFormofIntegerTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int[] A;
        int K;
        int[] expect;
        List<Integer> output;
        int seq=1;

        A = new int[]{1,2,0,0};
        K = 34;
        expect=new int[]{1,2,3,4};
        output=s.addToArrayForm(A,K);
        VerifyUtil.verifyUnsort(expect,output,seq++);


        A = new int[]{2,7,4};
        K = 181;
        expect=new int[]{4,5,5};
        output=s.addToArrayForm(A,K);
        VerifyUtil.verifyUnsort(expect,output,seq++);

        A = new int[]{9,9,9,9,9,9,9,9,9,9};
        K = 1;
        expect=new int[]{1,0,0,0,0,0,0,0,0,0,0};
        output=s.addToArrayForm(A,K);
        VerifyUtil.verifyUnsort(expect,output,seq++);


        A = new int[]{1};
        K = 999;
        expect=new int[]{1,0,0,0};
        output=s.addToArrayForm(A,K);
        VerifyUtil.verifyUnsort(expect,output,seq++);

        A = new int[]{0};
        K = 23;
        expect=new int[]{2,3};
        output=s.addToArrayForm(A,K);
        VerifyUtil.verifyUnsort(expect,output,seq++);
    }
}
