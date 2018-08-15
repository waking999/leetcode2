package common;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
    public static final int IMPOSSIBLE_VALUE = Integer.MIN_VALUE;
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }


    public String toString() {
        return Integer.toString(this.val);
    }

}
