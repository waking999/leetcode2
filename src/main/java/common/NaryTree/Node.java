package common.NaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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