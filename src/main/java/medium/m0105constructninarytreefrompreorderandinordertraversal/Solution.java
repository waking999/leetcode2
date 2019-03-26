package medium.m0105constructninarytreefrompreorderandinordertraversal;

import common.TreeNode;

public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {


        int inEnd = inorder.length - 1;
        return buildTree(inorder, 0, inEnd, preorder, 0);
    }

    private TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] preorder, int preStart) {
        if(inStart>inEnd||preStart>=preorder.length){
            return null;
        }
        TreeNode node = new TreeNode(preorder[preStart]);
        int inIdx=inStart;
        for(int i=inStart;i<=inEnd;i++){
            if(inorder[i]==preorder[preStart]){
                inIdx=i;
                break;
            }
        }

        node.left=buildTree(inorder,inStart,inIdx-1,preorder,preStart+1);
        node.right=buildTree(inorder,inIdx+1,inEnd,preorder,preStart+(inIdx-inStart)+1);
        return node;
    }
}
