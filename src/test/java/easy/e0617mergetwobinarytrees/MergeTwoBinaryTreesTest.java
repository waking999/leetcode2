package easy.e0617mergetwobinarytrees;

import common.NormalBinaryTreeNode;
import common.TreeNode;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;


public class MergeTwoBinaryTreesTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        Integer[] nodes1;
        Integer[] nodes2;
        TreeNode root1;
        TreeNode root2;
        TreeNode outputNode;

        Integer[] expect;
        List<Integer> output;
        int seq = 1;

        nodes1 = new Integer[]{1, 3, 2, 5};
        nodes2 = new Integer[]{2, 1, 3, null, 4, null, 7};
        expect = new Integer[]{3, 4, 5, 5, 4, null, 7};

        root1 = NormalBinaryTreeNode.constructTreeNode(nodes1);
        root2 = NormalBinaryTreeNode.constructTreeNode(nodes2);
        outputNode = s.mergeTrees(root1, root2);

        output = NormalBinaryTreeNode.unconstructTreeNodeList(outputNode);
        VerifyUtil.verifyUnsort(expect, output, seq++);
    }
}
