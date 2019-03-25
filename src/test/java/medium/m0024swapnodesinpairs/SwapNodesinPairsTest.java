package medium.m0024swapnodesinpairs;

import common.ListNode;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SwapNodesinPairsTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int[] nums;
        ListNode head;
        int[] expect;
        ListNode outputNodes;
        List<Integer> output;
        int seq=1;

        nums=new int[]{1,2,3,4};
        head=ListNode.constructListNode(nums);
        expect=new int[]{2,1,4,3};
        outputNodes=s.swapPairs(head);
        output=ListNode.unConstructListNode(outputNodes);
        VerifyUtil.verifyUnsort(expect,output,seq++);


    }
}
