package easy.e0501findmodeinbinarysearchtree;

import common.TreeNode;



public class Solution {
    public int[] findMode(TreeNode root) {

        count = 0;
        maxCount = 0;
        currVal = Integer.MIN_VALUE;
        modeCount = 0;

        inorder(root);


        rtn = new int[modeCount];
        count = 0;
        currVal = Integer.MIN_VALUE;
        index=0;

        inorder1(root);

        return rtn;
    }

    private int count;
    private int maxCount;
    private int currVal;
    private int modeCount;
    private int[] rtn;
    private int index;

    private void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        inorder(node.left);

        if (node.val != currVal) {
            count = 1;
            currVal = node.val;
            if (count > maxCount) {
                maxCount = count;
                modeCount = 1;
            } else if (count == maxCount) {
                modeCount++;
            }
        } else {
            count++;
            if (count > maxCount) {
                maxCount = count;
                modeCount = 1;
            } else if (count == maxCount) {
                modeCount++;
            }
        }
        inorder(node.right);
    }

    private void inorder1(TreeNode node) {
        if (node == null) return;
        inorder1(node.left);
        if (node.val != currVal) {
            count = 1;
            currVal = node.val;
            if (count == maxCount) {
                rtn[index] = node.val;
                index++;
            }
        } else {
            count++;
            if (count == maxCount) {
                rtn[index] = node.val;
                index++;
            }
        }
        inorder1(node.right);
    }
}
