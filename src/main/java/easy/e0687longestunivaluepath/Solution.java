package easy.e0687longestunivaluepath;

import common.TreeNode;

public class Solution {
    private int longest;

    public int longestUnivaluePath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(root, root.val);
        return longest;
    }

    private int dfs(TreeNode node, int val) {
        if (node == null) {
            return 0;
        }
        int left = dfs(node.left, node.val);
        int right = dfs(node.right, node.val);
        longest = Math.max(left + right, longest);
        if (node.val == val) {
            return Math.max(left, right) + 1;
        }
        return 0;
    }
}
