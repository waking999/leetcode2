package medium.m0120triangle;

import common.Util;
import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TriangleTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        Integer[][] matrix;
        List<List<Integer>> triangle;
        int expect;
        int output;
        int seq = 1;

        matrix = new Integer[][]{
                {2},
                {3, 4},
                {6, 5, 7},
                {4, 1, 8, 3}
        };
        triangle= Util.convertMatrixToList(matrix);
        expect=11;
        output=s.minimumTotal(triangle);
        VerifyUtil.verify(expect,output,seq++);



    }
}
