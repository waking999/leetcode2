package medium.m0024swapnodesinpairs;

import common.ListNode;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode p=head;
        while(p!=null&&p.next!=null){
            int tmp=p.val;
            p.val=p.next.val;
            p.next.val=tmp;
            p=p.next.next;
        }



        return head;
    }
}
