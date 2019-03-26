package medium.m0117populatingnextrightpointersineachnodeii;

import common.VerifyUtil;
import common.rightpointer.Node;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PopulatingNextRightPointersinEachNodeIITest {
    @Test
    public void test1() {
        Solution s = new Solution();

        Integer[] nodes;
        Node root;
        Node outputNode;
        Integer[] expect;
        List<Integer> output;
        int seq = 1;

        nodes = new Integer[]{1, 2, 3, 4, 5, null, 7};
        root = Node.constructNode(nodes);
        expect = new Integer[]{null, 3, 5, 7, null, null};
        outputNode = s.connect(root);
        output = Node.getNodeNexts(outputNode);
        VerifyUtil.verifyUnsort(expect, output, seq++);

        nodes = new Integer[]{1, 2, 3, 4, null, null, 5};
        root = Node.constructNode(nodes);
        expect = new Integer[]{null, 3, 5, null, null};
        outputNode = s.connect(root);
        output = Node.getNodeNexts(outputNode);
        VerifyUtil.verifyUnsort(expect, output, seq++);

        nodes = new Integer[]{1, 2, 3, 4,5 ,null,6,7, null,null,null,null,8};
        root = Node.constructNode(nodes);
        expect = new Integer[]{null, 3, 5, 8,6,null,null, null};
        outputNode = s.connect(root);
        output = Node.getNodeNexts(outputNode);
        VerifyUtil.verifyUnsort(expect, output, seq++);


    }

}
