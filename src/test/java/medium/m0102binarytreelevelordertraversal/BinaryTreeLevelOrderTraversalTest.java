package medium.m0102binarytreelevelordertraversal;

import common.NormalBinaryTreeNode;
import common.TreeNode;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BinaryTreeLevelOrderTraversalTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        Integer[] nodes;
        TreeNode root;
        int[][] expect;
        List<List<Integer>> output;
        int seq=1;

        nodes=new Integer[]{3,9,20,null,null,15,7};
        root= NormalBinaryTreeNode.constructTreeNode(nodes);
        expect=new int[][]{{3},{9,20},{15,7}};
        output=s.levelOrder(root);
        VerifyUtil.verifyUnsort(expect,output,seq++);

        nodes=new Integer[]{1,2,null,3,null,4,null,5};
        root= NormalBinaryTreeNode.constructTreeNode(nodes);
        expect=new int[][]{{1},{2},{3},{4},{5}};
        output=s.levelOrder(root);
        VerifyUtil.verifyUnsort(expect,output,seq++);
    }
}
