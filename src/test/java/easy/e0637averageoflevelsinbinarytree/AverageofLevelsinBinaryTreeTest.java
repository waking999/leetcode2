package easy.e0637averageoflevelsinbinarytree;

import common.NormalBinaryTreeNode;
import common.TreeNode;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AverageofLevelsinBinaryTreeTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        Integer[] nodes;
        TreeNode root;
        double[] expect;
        List<Double> output;
        int seq = 1;

        nodes = new Integer[]{3, 9, 20, 15, 7};
        root = NormalBinaryTreeNode.constructTreeNode(nodes);
        expect = new double[]{3, 14.5, 11};
        output = s.averageOfLevels(root);
        VerifyUtil.verifyUnsort(expect, output, seq++);

        nodes = new Integer[]{5, 14, 1};
        root = NormalBinaryTreeNode.constructTreeNode(nodes);
        expect = new double[]{5, 7.5};
        output = s.averageOfLevels(root);
        VerifyUtil.verifyUnsort(expect, output, seq++);

        nodes = new Integer[]{2147483647, 2147483647, 2147483647};
        root = NormalBinaryTreeNode.constructTreeNode(nodes);
        expect = new double[]{2147483647, 2147483647};
        output = s.averageOfLevels(root);
        VerifyUtil.verifyUnsort(expect, output, seq++);
    }
}
