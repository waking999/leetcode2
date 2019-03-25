package easy.e0438findallanagramsinastring;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FindAllAnagramsinaStringTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        String str;
        String p;
        int[] expect;
        List<Integer> output;
        int seq = 1;

        str = "cbaebabacd";
        p = "abc";
        expect = new int[]{0, 6};
        output = s.findAnagrams(str, p);
        VerifyUtil.verifyUnsort(expect, output, seq++);

        str = "abab";
        p = "ab";
        expect = new int[]{0, 1, 2};
        output = s.findAnagrams(str, p);
        VerifyUtil.verifyUnsort(expect, output, seq++);


    }
}
