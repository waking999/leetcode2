package easy.e0897increasingordersearchtree;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();

        inOrder(root, nodes);

        TreeNode rtn = new TreeNode(nodes.get(0));
        TreeNode pointer = rtn;
        int nodesLen = nodes.size();
        for (int i = 1; i < nodesLen; i++) {
            TreeNode tmp = new TreeNode(nodes.get(i));
            pointer.right = tmp;
            pointer = tmp;
        }


        return rtn;
    }

    private void inOrder(TreeNode node, List<Integer> nodes) {
        if (node == null) {
            return;
        }
        inOrder(node.left, nodes);
        nodes.add(node.val);
        inOrder(node.right, nodes);

    }
}
