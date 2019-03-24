package easy.e0653twosumivinputisabst;

import common.BinarySearchTreeNode;
import common.TreeNode;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class TwoSumIVInputisaBSTTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int[] nodes;
        TreeNode root;
        int k;
        boolean expect;
        boolean output;
        int seq = 1;

        nodes = new int[]{5, 3, 6, 2, 4, 7};
        root = BinarySearchTreeNode.constructTreeNode(nodes);
        k = 9;
        expect = true;
        output = s.findTarget(root, k);
        VerifyUtil.verify(expect, output, seq++);


        nodes = new int[]{5, 3, 6, 2, 4, 7};
        root = BinarySearchTreeNode.constructTreeNode(nodes);
        k = 28;
        expect = false;
        output = s.findTarget(root, k);
        VerifyUtil.verify(expect, output, seq++);
    }
}
