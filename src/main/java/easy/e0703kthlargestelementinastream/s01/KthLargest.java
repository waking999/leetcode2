package easy.e0703kthlargestelementinastream.s01;

import java.util.Arrays;

public class KthLargest {

    private ListNode kthNode;
    private ListNode head;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k=k;

        kthNode = null;
        head = null;

        if (nums.length == 0) {
            return;
        }

        Arrays.sort(nums);
        head = new ListNode(nums[nums.length - 1]);

        ListNode p = head;


        for (int i = nums.length - 2; i >= 0; i--) {
            ListNode tmp = new ListNode(nums[i]);
            p.next = tmp;
            tmp.pre = p;
            p = tmp;
            if (i + k == nums.length) {
                kthNode = p;
            }
        }
    }

    public int add(int val) {
        ListNode p = null;
        if (head == null) {
            //the initalized nums is blank
            head = new ListNode(val);
            //kthNode = head;
            //return kthNode.val;
        } else {
            if (val > head.val) {
                //the being inserted value is higher than the first node's value
                ListNode tmp = new ListNode(val);
                tmp.next = head;
                head.pre = tmp;
                head = tmp;
                p = head;
            } else {
                p = head;
                while (p.next != null && p.next.val >= val) {
                    p = p.next;
                }
                addNode(val, p);
            }
        }
        if (kthNode == null) {
            int count=1;
            p=head;
            while (p != null) {
                if(count==k){
                    break;
                }
                p = p.next;
                count++;

            }
            kthNode = p;
            return kthNode.val;
        } else {
            if (kthNode.val >= val) {
                return kthNode.val;
            } else {
                kthNode = kthNode.pre;
                return kthNode.val;
            }
        }


    }

    private void addNode(int val, ListNode p) {
        ListNode tmp = new ListNode(val);
        tmp.next = p.next;
        tmp.pre = p;
        if (p.next != null) {
            p.next.pre = tmp;
        }
        p.next = tmp;
    }

    private class ListNode {
        int val;
        ListNode pre;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}
