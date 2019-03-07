package easy.e0206reverselinkedlist.s02;

import common.ListNode;

import java.util.Stack;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }

        Stack<ListNode> s = new Stack<>();
        s.push(null);
        while (head != null) {
            s.push(head);
            head = head.next;
        }

        ListNode newHead = s.peek();

        while (!s.isEmpty() && s.peek() != null) {
            ListNode p1 = s.pop();
            ListNode p2 = s.peek();
            p1.next = p2;
            if (p2 != null) {
                p2.next = null;
            }
        }

        return newHead;
    }
}
