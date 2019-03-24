package easy.e0687longestunivaluepath;

import common.NormalBinaryTreeNode;
import common.TreeNode;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class LongestUnivaluePathTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        Integer[] nodes;
        TreeNode root;
        int expect;
        int output;
        int seq = 0;

        nodes = new Integer[]{5, 4, 5, 1, 1, null, 5};
        root = NormalBinaryTreeNode.constructTreeNode(nodes);
        expect = 2;
        output = s.longestUnivaluePath(root);
        VerifyUtil.verify(expect, output, ++seq);

        nodes = new Integer[]{1, 4, 5, 4, 4, null, 5};
        root = NormalBinaryTreeNode.constructTreeNode(nodes);
        expect = 2;
        output = s.longestUnivaluePath(root);
        VerifyUtil.verify(expect, output, ++seq);

    }
}
