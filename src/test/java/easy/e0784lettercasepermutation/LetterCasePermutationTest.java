package easy.e0784lettercasepermutation;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LetterCasePermutationTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        String S;
        String[] expect;
        List<String> output;
        int seq = 1;

        S = "a1b2";
        expect = new String[]{"a1b2", "a1B2", "A1b2", "A1B2"};
        output = s.letterCasePermutation(S);
        VerifyUtil.verifySort(expect, output, seq++);


        S = "3z4";
        expect = new String[]{"3z4", "3Z4"};
        output = s.letterCasePermutation(S);
        VerifyUtil.verifySort(expect, output, seq++);

        S = "12345";
        expect = new String[]{"12345"};
        output = s.letterCasePermutation(S);
        VerifyUtil.verifySort(expect, output, seq++);

        S = "C";
        expect = new String[]{"c","C"};
        output = s.letterCasePermutation(S);
        VerifyUtil.verifySort(expect, output, seq++);
    }
}
