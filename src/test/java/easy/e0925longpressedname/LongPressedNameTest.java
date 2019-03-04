package easy.e0925longpressedname;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class LongPressedNameTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        String name;
        String typed;
        boolean expect;
        boolean output;
        int seq = 1;

        name = "alex";
        typed = "aaleex";
        expect = true;
        output = s.isLongPressedName(name, typed);
        VerifyUtil.verify(expect, output, seq++);


        name = "saeed";
        typed = "ssaaedd";
        expect = false;
        output = s.isLongPressedName(name, typed);
        VerifyUtil.verify(expect, output, seq++);

        name = "leelee";
        typed = "lleeelee";
        expect = true;
        output = s.isLongPressedName(name, typed);
        VerifyUtil.verify(expect, output, seq++);

        name = "laiden";
        typed = "laiden";
        expect = true;
        output = s.isLongPressedName(name, typed);
        VerifyUtil.verify(expect, output, seq++);


        name = "pyplrz";
        typed = "ppyypllr";
        expect = false;
        output = s.isLongPressedName(name, typed);
        VerifyUtil.verify(expect, output, seq++);

    }
}
