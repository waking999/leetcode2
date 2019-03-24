package easy.e0653twosumivinputisabst;

import common.TreeNode;

public class Solution {


    public boolean findTarget(TreeNode root, int k) {

        return dfs(root, root, k);
    }

    private boolean search(TreeNode node, TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        if (root.val == k && node != root) {
            return true;
        }
        if (k < root.val) {
            return search(node, root.left, k);
        }

        return search(node, root.right, k);

    }

    private boolean dfs(TreeNode node, TreeNode root, int k) {
        if (node == null) {
            return false;
        }
        return search(node, root, k - node.val) || dfs(node.left, root, k) || dfs(node.right, root, k);
    }
}
