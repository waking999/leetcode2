package medium.m0220containsduplicateiii;

import common.TreeNode;

public class Solution {

    TreeNode root;


    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        root=null;
        int size=0; // tree size.

        for (int i = 0; i < nums.length; i++) {
            if (size-1 == k) {
                root = delete(root, nums[i-k-1]);
                size--;
            }
            if (insert(nums[i], t) ){
                return true;
            }
            size++;
        }
        return false;
    }

    boolean insert(int val, int t) {
        if (root == null) {
            root = new TreeNode(val);
            return false;
        }

        long delta = 0;
        TreeNode node = root;
        TreeNode prev = null;
        while (node != null) {
            prev = node;
            delta = node.val;
            delta -= val;
            if (delta >= -t && delta <= t) {
                return true;
            }
            node = node.val < val ? node.right : node.left;
        }

        if (prev.val < val) {
            prev.right = new TreeNode(val);
        }
        else {
            prev.left = new TreeNode(val);
        }
        return false;
    }

    TreeNode delete(TreeNode node, int val) {
        if (node == null) {
            return null;
        }
        if (node.val == val) {
            if (node.left == null || node.right == null) {
                return node.left == null ? node.right : node.left;
            }
            TreeNode iter = node.right;
            while(iter.left != null) {
                iter = iter.left;
            }
            node.val = iter.val;
            node.right = delete(node.right, node.val);
        }
        else if (node.val < val) {
            node.right = delete(node.right, val);
        }
        else {
            node.left = delete(node.left, val);
        }
        return node;
    }


}
