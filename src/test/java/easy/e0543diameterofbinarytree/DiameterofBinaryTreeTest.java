package easy.e0543diameterofbinarytree;

import common.NormalBinaryTreeNode;
import common.TreeNode;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class DiameterofBinaryTreeTest {


    @Test
    public void test1() {
        Solution s = new Solution();

        Integer[] nodes;

        TreeNode root;
        int expect;
        int output;
        int seq = 1;

        nodes = new Integer[]{1, 2, 3, 4, 5};
        root = NormalBinaryTreeNode.constructTreeNode(nodes);
        expect = 3;
        output = s.diameterOfBinaryTree(root);
        VerifyUtil.verify(expect, output, seq++);

        nodes = new Integer[]{4, -7, -3, null, null, -9, -3, 9, -7, -4, null, 6, null, -6, -6, null, null, 0, 6, 5, null, 9, null, null, -1, -4, null, null, null, -2};
        root = NormalBinaryTreeNode.constructTreeNode(nodes);
        expect = 8;
        output = s.diameterOfBinaryTree(root);
        VerifyUtil.verify(expect, output, seq++);
    }


}
