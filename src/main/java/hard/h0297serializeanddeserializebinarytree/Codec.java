package hard.h0297serializeanddeserializebinarytree;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> treeList = new ArrayList<>();

        q.add(root);

        while (!q.isEmpty()) {
            TreeNode n = q.poll();
            if (n == null) {
                treeList.add(null);
            } else {
                treeList.add(n.val);
                q.add(n.left);
                q.add(n.right);
            }
        }

        int rtnLen = treeList.size();
        int i = rtnLen - 1;
        int count = 0;
        while (treeList.get(i) == null) {
            count++;
            i--;
        }
        treeList = treeList.subList(0, rtnLen - count);
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Integer n : treeList) {
            if (n == null) {
                sb.append("null,");
            } else {
                sb.append(n).append(",");
            }
        }
        sb.setLength(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }



    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.trim().length()==0){
            return null;
        }
        data=data.substring(1,data.length()-1);
        if(data.trim().length()==0){
            return null;
        }

        String[] nodes=data.trim().split(",");


        int nodesLen = nodes.length;
        if (nodesLen == 0) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));

        Queue<TreeNode> parent = new LinkedList<>();
        parent.add(root);
        for (int i = 1; i < nodesLen; i++) {
            TreeNode c = null;
            if (i % 2 != 0) {
                if (!"null".equals(nodes[i])&&!"".equals(nodes[i].trim())) {
                    c = new TreeNode(Integer.parseInt(nodes[i]));
                    parent.add(c);
                    TreeNode t = parent.peek();
                    t.left = c;
                }
            } else {
                if (!"null".equals(nodes[i])&&!"".equals(nodes[i].trim())) {
                    c = new TreeNode(Integer.parseInt(nodes[i]));
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
