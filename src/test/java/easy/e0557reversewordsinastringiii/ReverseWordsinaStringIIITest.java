package easy.e0557reversewordsinastringiii;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class ReverseWordsinaStringIIITest {
    @Test
    public void test1() {
        Solution s = new Solution();

        String str;
        String expect;
        String output;
        int seq = 1;

        str = "Let's take LeetCode contest";
        expect = "s'teL ekat edoCteeL tsetnoc";
        output = s.reverseWords(str);
        VerifyUtil.verify(expect, output, seq++);
    }
}
