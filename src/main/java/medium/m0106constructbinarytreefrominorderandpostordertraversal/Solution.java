package medium.m0106constructbinarytreefrominorderandpostordertraversal;

import common.TreeNode;

public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int inEnd = inorder.length - 1;
        int postEnd = postorder.length - 1;
        return buildTree(inorder, 0, inEnd, postorder, postEnd);
    }


    private TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postEnd) {
        if (postEnd < 0 || inEnd < inStart) {
            return null;
        }
        TreeNode node = new TreeNode(postorder[postEnd]);
        int inIdx = inEnd;
        for (int i = inEnd; i >= inStart; i--) {
            if (postorder[postEnd] == inorder[i]) {
                inIdx = i;
                break;
            }
        }
        node.left = buildTree(inorder,  inStart, inIdx - 1,postorder, postEnd - (inEnd - inIdx) - 1);
        node.right = buildTree(inorder, inIdx + 1, inEnd, postorder, postEnd - 1);


        return node;
    }


}
