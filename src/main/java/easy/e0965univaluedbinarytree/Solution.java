package easy.e0965univaluedbinarytree;

import common.TreeNode;

public class Solution {
    public boolean isUnivalTree(TreeNode root) {
        int rootVal = root.val;

        diffFound = false;
        dfs(root, rootVal);
        return !diffFound;
    }

    boolean diffFound;

    private void dfs(TreeNode node, int rootVal) {
        if (node == null) {
            return;
        }
        if (node.val != rootVal) {
            diffFound = true;
            return;
        }
        if (!diffFound) {
            dfs(node.left, rootVal);
        }
        if (!diffFound) {
            dfs(node.right, rootVal);
        }
    }
}
