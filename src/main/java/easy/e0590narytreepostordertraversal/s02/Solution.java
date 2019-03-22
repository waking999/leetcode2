package easy.e0590narytreepostordertraversal.s02;

import common.NaryTree.Node;

import java.util.*;

public class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> rtn = new ArrayList<>();
        if (root == null) {
            return rtn;
        }

        Queue<Integer> queue = new LinkedList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            ((LinkedList<Integer>) queue).addFirst(node.val);
            List<Node> children = node.children;
            if (children != null) {
                for (Node child : children) {
                    stack.push(child);
                }
            }
        }

        while (!queue.isEmpty()) {
            rtn.add(((LinkedList<Integer>) queue).pollFirst());
        }

        return rtn;
    }

}
