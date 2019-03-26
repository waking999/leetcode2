package easy.e0558quadtreeintersection;

import common.NormalBinaryTreeNode;
import common.QuadTree.Node;
import org.junit.jupiter.api.Test;

public class QuadTreeIntersectionTest {
    @Test
    public void test1() {

        Solution s = new Solution();

        int[][] aGrid;
        Node aTree;
        int[][] bGrid;
        Node bTree;
        Node cTree;

        aGrid = new int[][]{
                {1, 1, 1, 1, 1, 1, 1, 1}
                , {1, 1, 1, 1, 1, 1, 1, 1}
                , {1, 1, 1, 1, 1, 1, 1, 1}
                , {1, 1, 1, 1, 1, 1, 1, 1}
                , {0, 0, 0, 0, 0, 0, 0, 0}
                , {0, 0, 0, 0, 0, 0, 0, 0}
                , {0, 0, 0, 0, 0, 0, 0, 0}
                , {0, 0, 0, 0, 0, 0, 0, 0}
        };
        aTree = Node.construct(aGrid);


        bGrid = new int[][]{
                {1, 1, 1, 1, 0, 0, 0, 0}
                , {1, 1, 1, 1, 0, 0, 0, 0}
                , {1, 1, 1, 1, 1, 1, 1, 1}
                , {1, 1, 1, 1, 1, 1, 1, 1}
                , {1, 1, 1, 1, 0, 0, 0, 0}
                , {1, 1, 1, 1, 0, 0, 0, 0}
                , {1, 1, 1, 1, 0, 0, 0, 0}
                , {1, 1, 1, 1, 0, 0, 0, 0}
        };
        bTree = Node.construct(bGrid);

        cTree = s.intersect(aTree, bTree);



    }

    @Test
    public void test2() {

        Solution s = new Solution();

        int[][] aGrid;
        Node aTree;
        int[][] bGrid;
        Node bTree;
        Node cTree;

        aGrid = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0}
                , {0, 0, 0, 0, 0, 0, 0, 0}
                , {0, 0, 0, 0, 0, 0, 0, 0}
                , {0, 0, 0, 0, 0, 0, 0, 0}
                , {1, 1, 1, 1, 1, 1, 1, 1}
                , {1, 1, 1, 1, 1, 1, 1, 1}
                , {1, 1, 1, 1, 1, 1, 1, 1}
                , {1, 1, 1, 1, 1, 1, 1, 1}

        };
        aTree = Node.construct(aGrid);


        bGrid = new int[][]{
                {1, 1, 1, 1, 1, 1, 1, 1}
                , {1, 1, 1, 1, 1, 1, 1, 1}
                , {1, 1, 1, 1, 1, 1, 1, 1}
                , {1, 1, 1, 1, 1, 1, 1, 1}
                , {0, 0, 0, 0, 1, 1, 1, 1}
                , {0, 0, 0, 0, 1, 1, 1, 1}
                , {0, 0, 0, 0, 1, 1, 1, 1}
                , {0, 0, 0, 0, 1, 1, 1, 1}
        };
        bTree = Node.construct(bGrid);

        cTree = s.intersect(aTree, bTree);



    }
}
