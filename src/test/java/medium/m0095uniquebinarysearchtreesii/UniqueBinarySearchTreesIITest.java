package medium.m0095uniquebinarysearchtreesii;

import common.TreeNode;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class UniqueBinarySearchTreesIITest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int n;
        Integer[][] expect;
        List<TreeNode> outputList;
        int outputListSize;
        List<List<Integer>> output;
        int seq = 1;


        n = 3;
        expect = new Integer[][]{
                {1, null, 3, 2},
                {3, 2, null, 1},
                {3, 1, null, null, 2},
                {2, 1, 3},
                {1, null, 2, null, 3}
        };
        outputList = s.generateTrees(n);
        outputListSize = outputList.size();
        output = new ArrayList<>(outputListSize);
        for (TreeNode node : outputList) {
            List<Integer> list1 = TreeNode.unconstructTreeNodeList(node);
            output.add(list1);
        }
        VerifyUtil.verifySortedOut(expect, output, seq++);

        n = 0;
        expect = new Integer[][]{
        };
        outputList = s.generateTrees(n);
        outputListSize = outputList.size();
        output = new ArrayList<>(outputListSize);
        for (TreeNode node : outputList) {
            List<Integer> list1 = TreeNode.unconstructTreeNodeList(node);
            output.add(list1);
        }
        VerifyUtil.verifySortedOut(expect, output, seq++);
    }
}