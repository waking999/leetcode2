package easy.e0160intersectionoftwolinkedlists;

import common.ListNode;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;


public class IntersectionofTwoLinkedListsTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int[] aNums;
        int[] bNums;
        int skipA;
        int skipB;
        ListNode a;
        ListNode b;
        ListNode headA;
        ListNode headB;

        ListNode outputNode;
        int expect;
        int output;
        int seq = 1;

        /////////////////////////////////////
        a = null;
        b = null;
        outputNode = s.getIntersectionNode(a, b);
        assert (outputNode == null) : seq+"wrong";
        seq++;

        //////////////////////////////////////
        aNums = new int[]{4, 1, 8, 4, 5};
        bNums = new int[]{5, 0, 1, 8, 4, 5};
        skipA = 2;
        skipB = 3;
        a = new ListNode(aNums[0]);
        headA = a;
        for (int i = 1; i < skipA; i++) {
            a.next = new ListNode(aNums[i]);
            a = a.next;
        }
        b = new ListNode(bNums[0]);
        headB = b;
        for (int i = 1; i < skipB; i++) {
            b.next = new ListNode(aNums[i]);
            b = b.next;
        }
        int aNumsLen = aNums.length;
        int remainingLen = aNumsLen - skipA;
        for (int i = 0; i < remainingLen; i++) {
            ListNode tmp = new ListNode(aNums[i + skipA]);
            a.next = tmp;
            b.next = tmp;
            a = a.next;
            b = b.next;
        }
        expect = 8;
        outputNode = s.getIntersectionNode(headA, headB);
        output=outputNode.val;
        VerifyUtil.verify(expect, output, seq++);






    }
}
