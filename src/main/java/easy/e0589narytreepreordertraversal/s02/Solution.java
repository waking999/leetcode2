package easy.e0589narytreepreordertraversal.s02;

import common.narytree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> rtn = new ArrayList<>();
        if (root == null) {
            return rtn;
        }

        LinkedList<Node> queue=new LinkedList<>();
        queue.addFirst(root);
        while(!queue.isEmpty()){
            Node node= queue.pollFirst();
            rtn.add(node.val);
            List<Node> children=node.children;
            if(children!=null){
                int childrenSize=children.size();
                for(int i=childrenSize-1;i>=0;i--){
                    Node child=children.get(i);
                    queue.addFirst(child);
                }
            }
        }

        return rtn;
    }

}
