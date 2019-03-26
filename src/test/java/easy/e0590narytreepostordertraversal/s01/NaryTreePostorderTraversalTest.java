package easy.e0590narytreepostordertraversal.s01;

import common.narytree.Node;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class NaryTreePostorderTraversalTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int[] values;
        int[] parentIdxs;
        Node root;
        int[] expect;
        List<Integer> output;
        int seq = 1;

        values = new int[]{1, 3, 2, 4, 5, 6, 7, 8};
        parentIdxs = new int[]{Node.IMPOSSIBLE_VALUE, 0, 0, 0, 1, 1, 3, 3};
        root = Node.constructTreeNode(values, parentIdxs);
        expect = new int[]{5, 6, 3, 2, 7, 8, 4, 1};
        output = s.postorder(root);
        VerifyUtil.verifyUnsort(expect, output, seq++);
    }
}
