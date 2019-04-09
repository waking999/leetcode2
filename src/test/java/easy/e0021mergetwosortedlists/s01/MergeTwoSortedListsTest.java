package easy.e0021mergetwosortedlists.s01;

import common.ListNode;
import org.junit.jupiter.api.Test;

import java.util.List;


import static common.VerifyUtil.verifyUnsort;

public class MergeTwoSortedListsTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int[] nums1;
        ListNode l1;
        int[] nums2;
        ListNode l2;
        ListNode l3;
        int[] expect;
        List<Integer> output;
        int seq = 1;

        nums1 = new int[]{1, 3, 5};
        nums2 = new int[]{2, 4, 6};
        l1 = ListNode.constructListNode(nums1);
        l2 = ListNode.constructListNode(nums2);
        l3 = s.mergeTwoLists(l1, l2);
        expect = new int[]{1, 2, 3, 4, 5, 6};
        output = ListNode.unConstructListNode(l3);
        verifyUnsort(expect, output, seq++);


        nums2 = new int[]{2, 4, 6};
        l1 = null;
        l2 =  ListNode.constructListNode(nums2);
        l3 = s.mergeTwoLists(l1, l2);
        expect = new int[]{2,4,6};
        output = ListNode.unConstructListNode(l3);
        verifyUnsort(expect, output, seq++);

    }
}
