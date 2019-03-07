package easy.e0206reverselinkedlist.s03;

import common.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }

        ListNode r = head;
        ListNode p = head;
        ListNode pre = null;
        while (p != null && p.next != null) {
            p = p.next;
            r.next = pre;
            pre = r;
            r = p;
        }
        r.next=pre;

        return r;
    }
}
