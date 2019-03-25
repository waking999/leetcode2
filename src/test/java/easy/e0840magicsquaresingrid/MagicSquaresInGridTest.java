package easy.e0840magicsquaresingrid;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class MagicSquaresInGridTest {

    @Test
    public void testIsMagic() {
        Solution s = new Solution();
        int[] square;
        int seq = 0;
        boolean expect;
        boolean output;

        square = new int[]{4, 3, 8, 9, 5, 1, 2, 7, 6};
        expect = true;
        output = s.isMagic(square, 15);
        VerifyUtil.verify(expect, output, seq++);

        square = new int[]{3, 8, 4, 5, 1, 9, 7, 6, 2};
        expect = false;
        output = s.isMagic(square, 15);
        VerifyUtil.verify(expect, output, seq++);

    }

    @Test
    public void testNumMagicSquaresInside() {
        Solution s = new Solution();
        int[][] grid;


        int expect;
        int output;
        int seq = 0;


        grid = new int[][]{{4, 3, 8, 4}, {9, 5, 1, 9}, {2, 7, 6, 2}};
        expect = 1;
        output = s.numMagicSquaresInside(grid);
        VerifyUtil.verify(expect, output, seq++);


        grid = new int[][]{{10, 3, 5}, {1, 6, 11}, {7, 9, 2}};
        expect = 0;
        output = s.numMagicSquaresInside(grid);
        VerifyUtil.verify(expect, output, seq++);


        grid = new int[][]{{7, 0, 5}, {2, 4, 6}, {3, 8, 1}};
        expect = 0;
        output = s.numMagicSquaresInside(grid);
        VerifyUtil.verify(expect, output, seq++);

        grid = new int[][]{{2,7,6},{1,5,9},{4,3,8}};
        expect = 0;
        output = s.numMagicSquaresInside(grid);
        VerifyUtil.verify(expect, output, seq++);
    }
}
