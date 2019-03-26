package medium.m0117populatingnextrightpointersineachnodeii;

import common.rightpointer.Node;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public Node connect(Node root) {
        if(root==null){
            return null;
        }
        root.next=null;
        helper(root);
        return root;
    }

    private void helper(Node root){
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;++i)
            {
                Node temp=q.poll();
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
                Node temp1;
                if(i==n-1)
                    temp1=null;
                else
                    temp1=q.peek();
                temp.next=temp1;
            }

        }
    }
}
