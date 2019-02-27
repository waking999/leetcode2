package easy.e0993cousinsinbinarytree;

import common.NormalBinaryTreeNode;
import common.TreeNode;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class CousinsinBinaryTreeTest {
    @Test
    public void test1(){
        Solution s=new Solution();


        Integer[] nodes;
        TreeNode root;
        int x;
        int y;
        boolean expect;
        boolean output;
        int seq=0;

        nodes=new Integer[]{ 1,2,3,null,4,null,5};
        root=NormalBinaryTreeNode.constructTreeNode(nodes);
        x=5;
        y=4;
        expect=true;
        output=s.isCousins(root,x,y);
        VerifyUtil.verify(expect,output,seq++);


        nodes=new Integer[]{ 1,2,3,4};
        root=NormalBinaryTreeNode.constructTreeNode(nodes);
        x=4;
        y=3;
        expect=false;
        output=s.isCousins(root,x,y);
        VerifyUtil.verify(expect,output,seq++);

        nodes=new Integer[]{ 1,2,3,null,4};
        root=NormalBinaryTreeNode.constructTreeNode(nodes);
        x=2;
        y=3;
        expect=false;
        output=s.isCousins(root,x,y);
        VerifyUtil.verify(expect,output,seq++);


        nodes=new Integer[]{1,2,3,null,null,4,5};
        root=NormalBinaryTreeNode.constructTreeNode(nodes);
        x=4;
        y=5;
        expect=false;
        output=s.isCousins(root,x,y);
        VerifyUtil.verify(expect,output,seq++);

    }
}
