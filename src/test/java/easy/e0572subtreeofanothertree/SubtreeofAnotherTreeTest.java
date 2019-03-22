package easy.e0572subtreeofanothertree;

import common.NormalBinaryTreeNode;
import common.TreeNode;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class SubtreeofAnotherTreeTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        Integer[] nodes1;
        TreeNode s1;
        Integer[] nodes2;
        TreeNode t1;
        boolean expect;
        boolean output;
        int seq = 1;

        nodes1 = new Integer[]{3, 4, 5, 1, 2};
        s1 = NormalBinaryTreeNode.constructTreeNode(nodes1);
        nodes2 = new Integer[]{4, 1, 2};
        t1 = NormalBinaryTreeNode.constructTreeNode(nodes2);
        expect = true;
        output = s.isSubtree(s1, t1);
        VerifyUtil.verify(expect, output, seq++);

        nodes1 = new Integer[]{3, 4, 5, 1, 2};
        s1 = NormalBinaryTreeNode.constructTreeNode(nodes1);
        nodes2 = new Integer[]{4, 1, 2, 0};
        t1 = NormalBinaryTreeNode.constructTreeNode(nodes2);
        expect = false;
        output = s.isSubtree(s1, t1);
        VerifyUtil.verify(expect, output, seq++);


        nodes1 = new Integer[]{3,4,5,1,2,null,null,0};
        s1 = NormalBinaryTreeNode.constructTreeNode(nodes1);
        nodes2 = new Integer[]{4,1,2};
        t1 = NormalBinaryTreeNode.constructTreeNode(nodes2);
        expect = false;
        output = s.isSubtree(s1, t1);
        VerifyUtil.verify(expect, output, seq++);


        nodes1 = new Integer[]{1,1};
        s1 = NormalBinaryTreeNode.constructTreeNode(nodes1);
        nodes2 = new Integer[]{1};
        t1 = NormalBinaryTreeNode.constructTreeNode(nodes2);
        expect = true;
        output = s.isSubtree(s1, t1);
        VerifyUtil.verify(expect, output, seq++);

        nodes1 = new Integer[]{1};
        s1 = NormalBinaryTreeNode.constructTreeNode(nodes1);
        nodes2 = new Integer[]{1};
        t1 = NormalBinaryTreeNode.constructTreeNode(nodes2);
        expect = true;
        output = s.isSubtree(s1, t1);
        VerifyUtil.verify(expect, output, seq++);
    }
}
