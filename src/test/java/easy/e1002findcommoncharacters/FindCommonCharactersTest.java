package easy.e1002findcommoncharacters;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FindCommonCharactersTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        String[] A;
        String[] expect;
        List<String> output;
        int seq = 1;

        A = new String[]{"bella", "label", "roller"};
        expect = new String[]{"e", "l", "l"};
        output = s.commonChars(A);
        VerifyUtil.verifySort(expect, output, seq++);


        A = new String[]{"cool","lock","cook"};
        expect = new String[]{"c", "o"};
        output = s.commonChars(A);
        VerifyUtil.verifySort(expect, output, seq++);
    }
}
