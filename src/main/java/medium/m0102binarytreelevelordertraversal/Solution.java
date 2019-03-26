package medium.m0102binarytreelevelordertraversal;

import common.TreeNode;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        ret.add(list);

        bfs(root, ret);

        return ret;
    }

    private int getLevel(int index) {
        return (int) (Math.log(index ) / Math.log(2));
    }

    private void bfs(TreeNode root, List<List<Integer>> list) {
        LinkedList<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int index = 1;
        int level = 0;
        while (!q.isEmpty()) {
            TreeNode node = q.pop();


            index++;
            if(node.left!=null) {
                q.offer(node.left);
                level = getLevel(index);
                List<Integer> tmp = getList(list, level);
                tmp.add(node.left.val);
            }


            index++;
            if(node.right!=null) {
                q.offer(node.right);
                level = getLevel(index);
                List<Integer> tmp = getList(list, level);
                tmp.add(node.right.val);
            }
        }
    }

    private List<Integer> getList(List<List<Integer>> list, int level) {
        if (level >= list.size()) {
            List<Integer> tmp = new ArrayList<>();
            list.add(tmp);
            return tmp;
        } else {
            return list.get(level);
        }
    }
}
