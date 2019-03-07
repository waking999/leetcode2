package easy.e0257binarytreepaths;

import common.NormalBinaryTreeNode;
import common.TreeNode;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BinaryTreePathsTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        Integer[] nodes;
        TreeNode root;
        String[] expect;
        List<String> output;
        int seq = 1;

        nodes = new Integer[]{1, 2, 3, null, 5};
        root = NormalBinaryTreeNode.constructTreeNode(nodes);
        expect = new String[]{"1->2->5", "1->3"};
        output = s.binaryTreePaths(root);
        VerifyUtil.verifySort(expect, output, seq++);


        nodes = new Integer[]{};
        root = NormalBinaryTreeNode.constructTreeNode(nodes);
        expect = new String[]{};
        output = s.binaryTreePaths(root);
        VerifyUtil.verifySort(expect, output, seq++);

    }
}