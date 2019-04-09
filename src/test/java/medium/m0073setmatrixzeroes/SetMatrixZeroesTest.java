package medium.m0073setmatrixzeroes;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class SetMatrixZeroesTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int[][] matrix;
        int[][] expect;
        int seq = 1;

        matrix = new int[][]{
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        expect = new int[][]{
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1}
        };
        s.setZeroes(matrix);
        VerifyUtil.verifyUnsort(expect, matrix, seq++);


        matrix = new int[][]{
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        expect = new int[][]{
                {0, 0, 0, 0},
                {0, 4, 5, 0},
                {0, 3, 1, 0}
        };
        s.setZeroes(matrix);
        VerifyUtil.verifyUnsort(expect, matrix, seq++);
    }
}
