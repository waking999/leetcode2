package medium.m0658findkclosestelements;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FindKClosestElementsTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int[] arr;
        int k;
        int x;
        int[] expect;
        List<Integer> output;
        int seq=1;

        arr=new int[]{1,2,3,4,5};
        k=4;
        x=3;
        expect=new int[]{1,2,3,4};
        output=s.findClosestElements(arr,k,x);
        VerifyUtil.verifyUnsort(expect,output,seq++);

        arr=new int[]{1,2,3,4,5};
        k=4;
        x=-1;
        expect=new int[]{1,2,3,4};
        output=s.findClosestElements(arr,k,x);
        VerifyUtil.verifyUnsort(expect,output,seq++);
    }
}
