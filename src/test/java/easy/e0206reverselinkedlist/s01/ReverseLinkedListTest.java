package easy.e0206reverselinkedlist.s01;

import common.ListNode;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ReverseLinkedListTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int[] nums;
        ListNode head;
        ListNode outputNode;
        List<Integer> output;
        int[] expect;
        int seq=1;

        nums = new int[] { 1, 2, 3, 4, 5, 6 };
        head = ListNode.constructListNode(nums);
        expect = new int[] { 6, 5, 4, 3, 2, 1 };
        outputNode = s.reverseList(head);
        output = ListNode.unConstructListNode(outputNode);
        VerifyUtil.verifyUnsort(expect,output,seq++);

    }
}
