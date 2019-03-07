package easy.e0257binarytreepaths;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        List<String> rtn = new ArrayList<>();

        dfs(root, sb, rtn);


        return rtn;
    }

    private void dfs(TreeNode node, StringBuilder sb, List<String> rtn) {
        if (node == null) {
            return;
        }

        sb.append(node.val);
        int sbPreLen = sb.length();
        if (node.left == null && node.right == null) {

            rtn.add(sb.toString());
            return;
        }

        if (node.left != null) {
            sb.append("->");
            dfs(node.left, sb, rtn);
        }
        sb.setLength(sbPreLen);

        if (node.right != null) {
            sb.append("->");
            dfs(node.right, sb, rtn);
        }
        sb.setLength(sbPreLen);
    }
}
