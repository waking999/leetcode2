package easy.e0572subtreeofanothertree;

import common.TreeNode;

public class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        return helper(s, t);
    }


    private boolean helper(TreeNode s, TreeNode t) {

        if (t == null && s == null) return true;
        if (s == null || t == null) return false;

        if (t.val == s.val
                && ((t.left == null && s.left == null) || (t.left != null && s.left != null && t.left.val == s.left.val))
                && ((t.right == null && s.right == null) || (t.right != null && s.right != null && t.right.val == s.right.val))
                && helper(s.left, t.left)
                && helper(s.right, t.right))
            return true;
        return helper(s.left, t) || helper(s.right, t);
    }
}
