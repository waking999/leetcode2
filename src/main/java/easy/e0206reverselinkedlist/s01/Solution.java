package easy.e0206reverselinkedlist.s01;

import common.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }

        if(head.next==null){
            return head;
        }

        ListNode newHead=reverseList(head.next);
        head.next.next=head;
        head.next=null;


        return newHead;
    }
}
