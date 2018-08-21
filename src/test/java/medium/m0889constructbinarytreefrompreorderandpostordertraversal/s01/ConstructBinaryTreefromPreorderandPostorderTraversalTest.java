package medium.m0889constructbinarytreefrompreorderandpostordertraversal.s01;

import common.TreeNode;
import common.Util;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ConstructBinaryTreefromPreorderandPostorderTraversalTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int[] pre;
        int[] post;
        TreeNode outputNode;
        int[] expect;
        List<Integer> output;
        int seq = 1;


        pre = new int[]{1, 2, 4, 5, 3, 6, 7};
        post = new int[]{4, 5, 2, 6, 7, 3, 1};
        expect = new int[]{1, 2, 3, 4, 5, 6, 7};
        outputNode = s.constructFromPrePost(pre, post);
        output = Util.unconstructTreeNodeList(outputNode);
        VerifyUtil.verifyUnsort(expect, output, seq++);
    }
}
