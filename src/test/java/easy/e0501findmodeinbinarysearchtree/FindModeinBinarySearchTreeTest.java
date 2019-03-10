package easy.e0501findmodeinbinarysearchtree;

import common.NormalBinaryTreeNode;
import common.TreeNode;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class FindModeinBinarySearchTreeTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        Integer[] nodes;
        TreeNode root;
        int[] expect;
        int[] output;
        int seq=1;

        nodes = new Integer[]{1,null,2,2};
        root = NormalBinaryTreeNode.constructTreeNode(nodes );
        expect = new int[]{2};
        output = s.findMode(root);
        VerifyUtil.verifySort(expect, output, seq++);


        nodes = new Integer[]{2147483647};
        root = NormalBinaryTreeNode.constructTreeNode(nodes );
        expect = new int[]{2147483647};
        output = s.findMode(root);
        VerifyUtil.verifySort(expect, output, seq++);

        nodes = new Integer[]{1,1,2};
        root = NormalBinaryTreeNode.constructTreeNode(nodes );
        expect = new int[]{1};
        output = s.findMode(root);
        VerifyUtil.verifySort(expect, output, seq++);
    }
}
