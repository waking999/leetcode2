package easy.e1022sumofroottoleafbinarynumbers;

import common.NormalBinaryTreeNode;
import common.TreeNode;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class SumofRootToLeafBinaryNumbersTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        Integer[] nodes;
        TreeNode root;
        int expect;
        int output;
        int seq=1;

        nodes=new Integer[]{1,0,1,0,1,0,1};
        root= NormalBinaryTreeNode.constructTreeNode(nodes);
        expect=22;
        output=s.sumRootToLeaf(root);
        VerifyUtil.verify(expect,output,seq++);
    }
}
