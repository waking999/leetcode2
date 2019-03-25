package medium.m0095uniquebinarysearchtreesii;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<TreeNode> generateTrees(int n) {
        if(n==0){
            return new ArrayList<>();
        }
        return generateTrees(1, n);
    }


    private List<TreeNode> generateTrees(int left, int right) {
        List<TreeNode> res = new ArrayList<>();
        if (left > right) {
            res.add(null);
            return res;
        }
        for (int i = left; i <= right; i++) {
            List<TreeNode> lefts = generateTrees(left, i - 1);
            List<TreeNode> rights = generateTrees(i + 1, right);
            for (TreeNode left1 : lefts) {

                for (TreeNode right1 : rights) {
                    TreeNode root = new TreeNode(i);
                    root.left = left1;
                    root.right = right1;
                    res.add(root);//存储所有可能行
                }
            }
        }
        return res;
    }

}
