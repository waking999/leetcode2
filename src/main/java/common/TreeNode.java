package common;


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
