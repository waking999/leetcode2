package medium.m0236lowestcommonancestorofabinarytree;

import common.NormalBinaryTreeNode;
import common.TreeNode;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class LowestCommonAncestorofaBinaryTreeTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        Integer[] nodes;
        TreeNode root;
        int p;
        int q;
        TreeNode pNode;
        TreeNode qNode;
        int expect;
        TreeNode outputNode;
        int output;
        int seq = 1;

        nodes = new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4};
        root = NormalBinaryTreeNode.constructTreeNode(nodes);
        p = 5;
        pNode = NormalBinaryTreeNode.findNode(root, p);
        q = 1;
        qNode = NormalBinaryTreeNode.findNode(root, q);
        expect = 3;
        outputNode = s.lowestCommonAncestor(root, pNode, qNode);
        output = outputNode.val;
        VerifyUtil.verify(expect, output, seq++);

        nodes = new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4};
        root = NormalBinaryTreeNode.constructTreeNode(nodes);
        p = 5;
        pNode = NormalBinaryTreeNode.findNode(root, p);
        q = 4;
        qNode = NormalBinaryTreeNode.findNode(root, q);
        expect = 5;
        outputNode = s.lowestCommonAncestor(root, pNode, qNode);
        output = outputNode.val;
        VerifyUtil.verify(expect, output, seq++);

        nodes = new Integer[]{37,-34,-48,null,-100,-101,48,null,null,null,null,-54,null,-71,-22,null,null,null,8};
        root = NormalBinaryTreeNode.constructTreeNode(nodes);
        p = -71;
        pNode = NormalBinaryTreeNode.findNode(root, p);
        q = 48;
        qNode = NormalBinaryTreeNode.findNode(root, q);
        expect = 48;
        outputNode = s.lowestCommonAncestor(root, pNode, qNode);
        output = outputNode.val;
        VerifyUtil.verify(expect, output, seq++);



    }
}
