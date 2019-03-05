package easy.e0944deletecolumnstomakesorted;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class DeleteColumnsToMakeSortedTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        String[] A;
        int expect;
        int output;
        int seq = 1;

        A = new String[]{"cba", "daf", "ghi"};
        expect = 1;
        output = s.minDeletionSize(A);
        VerifyUtil.verify(expect, output, seq++);


        A = new String[]{"a", "b"};
        expect = 0;
        output = s.minDeletionSize(A);
        VerifyUtil.verify(expect, output, seq++);



        A = new String[]{"rrjk","furt","guzm"};
        expect = 2;
        output = s.minDeletionSize(A);
        VerifyUtil.verify(expect, output, seq++);
    }
}
