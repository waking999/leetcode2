package easy.e0965univaluedbinarytree;

import common.NormalBinaryTreeNode;
import common.TreeNode;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class UnivaluedBinaryTreeTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        Integer[] nodes;
        TreeNode root;
        boolean expect;
        boolean output;
        int seq=1;

        nodes=new Integer[]{1,1,1,1,1,null,1};
        root= NormalBinaryTreeNode.constructTreeNode(nodes);
        expect=true;
        output=s.isUnivalTree(root);
        VerifyUtil.verify(expect,output,seq++);

        nodes=new Integer[]{2,2,2,5,2};
        root= NormalBinaryTreeNode.constructTreeNode(nodes);
        expect=false;
        output=s.isUnivalTree(root);
        VerifyUtil.verify(expect,output,seq++);
    }
}
