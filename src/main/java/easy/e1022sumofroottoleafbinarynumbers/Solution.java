package easy.e1022sumofroottoleafbinarynumbers;

import common.TreeNode;



public class Solution {
    public int sumRootToLeaf(TreeNode root) {
        sum=0;
        dfs(root,0);
        return sum;
    }

    private int sum;
    private void dfs(TreeNode node, int  parentVal){
        if(node==null){

            return;
        }
        int originalParentVal=parentVal;
        parentVal=(parentVal<<1)+node.val;

        if(node.left==null&&node.right==null){
            sum+=parentVal;
            return;
        }
        dfs(node.left,parentVal);
        dfs(node.right,parentVal);
        parentVal=originalParentVal;

    }
}
