package easy.e0589narytreepreordertraversal.s01;

import common.NaryTree.Node;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> rtn=new ArrayList<>();
        preOrder(root,rtn);
        return rtn;
    }

    private void preOrder(Node node, List<Integer> list){
        if(node==null){
            return;
        }
        list.add(node.val);
        List<Node> children=node.children;
        if(children!=null){
            for(Node c:children){
                preOrder(c,list);
            }
        }
    }
}
