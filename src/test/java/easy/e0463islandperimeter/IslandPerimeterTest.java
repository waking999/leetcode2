package easy.e0463islandperimeter;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class IslandPerimeterTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int[][] grid;
        int expect;
        int output;
        int seq = 1;

        grid = new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        expect = 16;
        output = s.islandPerimeter(grid);
        VerifyUtil.verify(expect, output, seq++);


        grid = new int[][]{{1}};
        expect = 4;
        output = s.islandPerimeter(grid);
        VerifyUtil.verify(expect, output, seq++);
    }
}
