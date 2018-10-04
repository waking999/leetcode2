package easy.e0905sortarraynyparity.s01;


import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class SortArrayByParityTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int[] A;
        int[] expect;
        int[] output;
        int seq = 1;

        A = new int[]{3, 1, 2, 4};
        expect = new int[]{4, 2, 1, 3};
        output = s.sortArrayByParity(A);
        VerifyUtil.verifyUnsort(expect, output, seq++);


        A = new int[]{};
        expect = new int[]{};
        output = s.sortArrayByParity(A);
        VerifyUtil.verifyUnsort(expect, output, seq++);

        A = new int[]{3};
        expect = new int[]{3};
        output = s.sortArrayByParity(A);
        VerifyUtil.verifyUnsort(expect, output, seq++);

        A = new int[]{2, 1, 2, 4};
        expect = new int[]{2, 4, 2, 1};
        output = s.sortArrayByParity(A);
        VerifyUtil.verifyUnsort(expect, output, seq++);

        A = new int[]{0,1};
        expect = new int[]{0,1};
        output = s.sortArrayByParity(A);
        VerifyUtil.verifyUnsort(expect, output, seq++);


        A = new int[]{0,2,1,4};
        expect = new int[]{0,2,4,1};
        output = s.sortArrayByParity(A);
        VerifyUtil.verifyUnsort(expect, output, seq++);

        A = new int[]{0,2};
        expect = new int[]{0,2};
        output = s.sortArrayByParity(A);
        VerifyUtil.verifyUnsort(expect, output, seq++);
    }
}
