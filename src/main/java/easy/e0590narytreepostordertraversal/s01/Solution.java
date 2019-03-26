package easy.e0590narytreepostordertraversal.s01;

import common.narytree.Node;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> rtn = new ArrayList<>();
        postOrder(root, rtn);
        return rtn;
    }


    private void postOrder(Node node, List<Integer> list) {
        if (node == null) {
            return;
        }
        List<Node> children = node.children;
        if (children != null) {
            for (Node c : children) {
                postOrder(c, list);
            }
        }
        list.add(node.val);
    }

}
