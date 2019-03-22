package easy.e0543diameterofbinarytree;

import common.TreeNode;

public class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        d = 0;
        getHeight(root);
        return d;
    }

    private int d;

    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int lH = getHeight(node.left);
        int rH = getHeight(node.right);
        d = Math.max(d, lH + rH);
        return Math.max(lH, rH)+1;
    }
}
