package easy.e0897increasingordersearchtree;

import common.NormalBinaryTreeNode;
import common.TreeNode;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class IncreasingOrderSearchTreeTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        Integer[] nodes;
        TreeNode root;
        TreeNode outputNode;
        List<Integer> output;
        Integer[] expect;
        int seq=1;

        nodes=new Integer[]{ 5,3,6,2,4,null,8,1,null,null,null,7,9};
        root=NormalBinaryTreeNode.constructTreeNode(nodes);
        expect=new Integer[]{1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9};
        outputNode = s.increasingBST(root);
        output=TreeNode.unconstructTreeNodeList(outputNode);
        VerifyUtil.verifyUnsort(expect,output,seq++);
    }
}
