package hard.h0297serializeanddeserializebinarytree;


import common.NormalBinaryTreeNode;
import common.TreeNode;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SerializeandDeserializeBinaryTreeTest {
    @Test
    public void test1(){
        Codec s=new Codec();

        Integer[] nodes;
        TreeNode root;
        String expect;
        String output;
        int seq=1;

        nodes=new Integer[]{1,2,3,null,null,4,5};
        root= NormalBinaryTreeNode.constructTreeNode(nodes);
        expect="[1,2,3,null,null,4,5]";
        output=s.serialize(root);
        VerifyUtil.verify(expect,output,seq++);
    }

    @Test
    public void test2(){
        Codec s=new Codec();

        String data;
        TreeNode outputNode;
        List<Integer> output;
        Integer[] expect;
        int seq=1;

        data="[1,2,3,null,null,4,5]";
        expect=new Integer[]{1,2,3,null,null,4,5};
        outputNode=s.deserialize(data);
        output=NormalBinaryTreeNode.unconstructTreeNodeList(outputNode);
        VerifyUtil.verifyUnsort(expect,output,seq++);

        data="";
        expect=null;
        outputNode=s.deserialize(data);
        output=NormalBinaryTreeNode.unconstructTreeNodeList(outputNode);
        VerifyUtil.verifyUnsort(expect,output,seq++);
    }

}
