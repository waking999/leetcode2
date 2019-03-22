package easy.e0541reversestringii;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class ReverseStringIITest {
    @Test
    public void test1() {
        Solution s = new Solution();

        String str;
        int k;
        String expect;
        String output;
        int seq = 1;

        str = "abcdefg";
        k = 2;
        expect = "bacdfeg";
        output = s.reverseStr(str, k);
        VerifyUtil.verify(expect, output, seq++);


        str = "abcdefg";
        k = 4;
        expect = "dcbaefg";
        output = s.reverseStr(str, k);
        VerifyUtil.verify(expect, output, seq++);


        str = "abcdefg";
        k = 8;
        expect = "gfedcba";
        output = s.reverseStr(str, k);
        VerifyUtil.verify(expect, output, seq++);

        str = "hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl";
        k = 39;
        expect = "fdcqkmxwholhytmhafpesaentdvxginrjlyqzyhehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqllgsqddebemjanqcqnfkjmi";
        output = s.reverseStr(str, k);
        VerifyUtil.verify(expect, output, seq++);


        str = "krmyfshbspcgtesxnnljhfursyissjnsocgdhgfxubewllxzqhpasguvlrxtkgatzfybprfmmfithphckksnvjkcvnsqgsgosfxc";
        k = 20;
        expect = "jlnnxsetgcpsbhsfymrkhfursyissjnsocgdhgfxtxrlvugsaphqzxllwebukgatzfybprfmmfithphccxfsogsgqsnvckjvnskk";
        output = s.reverseStr(str, k);
        VerifyUtil.verify(expect, output, seq++);



    }
}
