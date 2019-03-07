package common;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NormalBinaryTreeNode extends TreeNode {



    public NormalBinaryTreeNode(int x) {
        super(x);
    }


    public static TreeNode constructTreeNode(Integer[] nodes) {
        int nodesLen = nodes.length;
        if (nodesLen == 0) {
            return null;
        }
        TreeNode root = new TreeNode(nodes[0]);

        Queue<TreeNode> parent = new LinkedList<>();
        parent.add(root);
        for (int i = 1; i < nodesLen; i++) {
            TreeNode c = null;
            if (i % 2 != 0) {
                if (nodes[i] != null) {
                    c = new TreeNode(nodes[i]);
                    parent.add(c);
                    TreeNode t = parent.peek();
                    t.left = c;
                }
            } else {
                if (nodes[i] != null) {
                    c = new TreeNode(nodes[i]);
                    parent.add(c);
                    TreeNode t = parent.poll();
                    t.right = c;
                } else {
                    parent.poll();
                }
            }


        }

        return root;
    }




}