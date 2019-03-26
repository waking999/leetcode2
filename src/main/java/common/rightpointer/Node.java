package common.rightpointer;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }

    public static Node constructNode(Integer[] nodes) {
        int nodesLen = nodes.length;
        if (nodesLen == 0) {
            return null;
        }
        Node root = new Node(nodes[0]);

        Queue<Node> parent = new LinkedList<>();
        parent.add(root);
        for (int i = 1; i < nodesLen; i++) {
            Node c = null;
            if (i % 2 != 0) {
                if (nodes[i] != null) {
                    c = new Node(nodes[i]);
                    parent.add(c);
                    Node n = parent.peek();
                    n.left = c;
                }
            } else {
                if (nodes[i] != null) {
                    c = new Node(nodes[i]);
                    parent.add(c);
                    Node n = parent.poll();
                    n.right = c;
                } else {
                    parent.poll();
                }
            }


        }

        return root;
    }

    public static List<Integer> getNodeNexts(Node root){
        List<Integer> rtn=new ArrayList<>();
        preOrderGetNexts(root,rtn);
        return rtn;
    }

    private static void preOrderGetNexts(Node node, List<Integer> list){
        if(node==null){
            return;
        }
        if(node.next==null){
            list.add(null);
        }else {
            list.add(node.next.val);
        }
        preOrderGetNexts(node.left,list);
        preOrderGetNexts(node.right,list);

    }

}
