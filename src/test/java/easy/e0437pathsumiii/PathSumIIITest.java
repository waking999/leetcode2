package easy.e0437pathsumiii;

import common.NormalBinaryTreeNode;
import common.TreeNode;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class PathSumIIITest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Integer[] nodes;
        TreeNode root;
        int sum;
        int expect;
        int output;
        int seq=1;

        nodes = new Integer[]{10,5,-3,3,2,null,11,3,-2,null,1};
        root = NormalBinaryTreeNode.constructTreeNode(nodes);
        sum = 8;
        expect = 3;
        output = s.pathSum(root, sum);
        VerifyUtil.verify(expect, output, seq++);
    }
}
