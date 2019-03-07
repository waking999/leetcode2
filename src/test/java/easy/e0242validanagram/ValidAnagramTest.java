package easy.e0242validanagram;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class ValidAnagramTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        String s1;
        String s2;
        boolean expect;
        boolean output;
        int seq = 1;


        s1 = "anagram";
        s2 = "nagaram";
        expect = true;
        output = s.isAnagram(s1, s2);
        VerifyUtil.verify(expect, output, seq++);

        s1 = "rat";
        s2 = "car";
        expect = false;
        output = s.isAnagram(s1, s2);
        VerifyUtil.verify(expect, output, seq++);
    }
}
