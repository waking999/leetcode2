package common.NaryTree;

import java.util.List;

public class Node {
    public static final int IMPOSSIBLE_VALUE = Integer.MIN_VALUE;
    //private static Node targetNode;
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }


}