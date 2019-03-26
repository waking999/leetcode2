package medium.m0105constructninarytreefrompreorderandinordertraversal;

import common.NormalBinaryTreeNode;
import common.TreeNode;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ConstructBinaryTreefromPreorderandInorderTraversalTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int[] inorder;
        int[] preorder;
        Integer[] expect;
        TreeNode outputNode;
        List<Integer> output;
        int seq = 1;

        inorder = new int[]{4, 2, 5, 1, 6, 3, 7};
        preorder = new int[]{1, 2, 4, 5, 3, 6, 7};
        expect = new Integer[]{1, 2, 3, 4, 5, 6, 7};
        outputNode = s.buildTree(preorder, inorder);
        output = NormalBinaryTreeNode.unconstructTreeNodeList(outputNode);
        VerifyUtil.verifyUnsort(expect, output, seq++);

        inorder = new int[]{9,3,15,20,7};
        preorder = new int[]{3,9,20,15,7};
        expect = new Integer[]{3,9,20,null,null,15,7};
        outputNode = s.buildTree(preorder, inorder);
        output = NormalBinaryTreeNode.unconstructTreeNodeList(outputNode);
        VerifyUtil.verifyUnsort(expect, output, seq++);
    }
}
