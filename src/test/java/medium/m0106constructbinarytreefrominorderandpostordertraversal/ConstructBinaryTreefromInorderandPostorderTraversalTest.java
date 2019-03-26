package medium.m0106constructbinarytreefrominorderandpostordertraversal;

import common.NormalBinaryTreeNode;
import common.TreeNode;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ConstructBinaryTreefromInorderandPostorderTraversalTest {

    @Test
    public void test1() {
        Solution s = new Solution();

        int[] inorder;
        int[] postorder;
        Integer[] expect;

        TreeNode outputNode;
        List<Integer> output;
        int seq = 1;

        inorder = new int[]{4, 2, 5, 1, 6, 3, 7};
        postorder = new int[]{4, 5, 2, 6, 7, 3, 1};
        expect = new Integer[]{1, 2, 3, 4, 5, 6, 7};
        outputNode = s.buildTree(inorder, postorder);
        output = NormalBinaryTreeNode.unconstructTreeNodeList(outputNode);
        VerifyUtil.verifyUnsort(expect, output, seq++);

        inorder = new int[]{9, 3, 15, 20, 7};
        postorder = new int[]{9, 15, 7, 20, 3};
        expect = new Integer[]{3, 9, 20, null, null, 15, 7};
        outputNode = s.buildTree(inorder, postorder);
        output = NormalBinaryTreeNode.unconstructTreeNodeList(outputNode);
        VerifyUtil.verifyUnsort(expect, output, seq++);

    }
}
