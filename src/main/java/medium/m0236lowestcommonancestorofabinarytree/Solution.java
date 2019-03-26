package medium.m0236lowestcommonancestorofabinarytree;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        inorder=new ArrayList<>();
        preorder=new ArrayList<>();

        inorder(root, p.val, q.val);
        preorder(root, p.val, q.val);

        int inEnd = inorder.size() - 1;
        return search(inorder, 0, inEnd, preorder, 0);
    }

    private TreeNode search(List<TreeNode> inorder, int inStart, int inEnd, List<TreeNode> preorder, int preStart) {
        int maxInPos=Math.max(pInPos,qInPos);
        int minInPos=Math.min(pInPos,qInPos);

        while (inStart < inEnd&&preStart<preorder.size()) {
            int inIdx = inStart;
            for (int i = inStart; i <= inEnd; i++) {
                if (inorder.get(i).val == preorder.get(preStart).val) {
                    inIdx = i;
                    break;
                }
            }
            if(pInPos==inIdx){
                return inorder.get(pInPos);
            }
            if(qInPos==inIdx){
                return inorder.get(qInPos);
            }
            if(minInPos<inIdx&&maxInPos>inIdx){
                return inorder.get(inIdx);
            }else if(maxInPos<inIdx){
                preStart++;
                inEnd=inIdx-1;
            }else{
                preStart+=(inIdx-inStart+1);
                inStart=inIdx+1;
            }

        }
        return null;


    }

    private List<TreeNode> inorder;
    private int pInPos;
    private int qInPos;
    private List<TreeNode> preorder;
//    private int pPrePos;
//    private int qPrePos;

    private void inorder(TreeNode node, int p, int q) {
        if (node == null) {
            return;
        }
        inorder(node.left, p, q);
        inorder.add(node);
        if (node.val == p) {
            pInPos = inorder.size() - 1;
        } else if (node.val == q) {
            qInPos = inorder.size() - 1;
        }
        inorder(node.right, p, q);
    }

    private void preorder(TreeNode node, int p, int q) {
        if (node == null) {
            return;
        }
        preorder.add(node);
//        if (node.val == p) {
//            pPrePos = preorder.size() - 1;
//        } else if (node.val == q) {
//            qPrePos = preorder.size() - 1;
//        }
        preorder(node.left, p, q);
        preorder(node.right, p, q);
    }
}
