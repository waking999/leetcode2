package easy.e0617mergetwobinarytrees;

import common.TreeNode;

public class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        return merge(t1,t2);
    }


    private TreeNode merge(TreeNode t1,TreeNode t2){
        if(t1==null&&t2==null){
            return null;
        }
        if(t1!=null&&t2==null){
            return t1;
        }
        if(t1==null&&t2!=null){
            return t2;
        }
        if(t1!=null&&t2!=null){
            t1.val=t1.val+t2.val;
            t1.left=merge(t1.left,t2.left);
            t1.right=merge(t1.right,t2.right);
            return t1;
        }
        return null;
    }
}
