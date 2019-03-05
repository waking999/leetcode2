package easy.e0953verifyinganaliendictionary;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class VerifyingAnAlienDictionary {
    @Test
    public void test1() {
        Solution s = new Solution();

        String[] words;
        String order;
        boolean expect;
        boolean output;
        int seq = 1;

        words = new String[]{"hello", "leetcode"};
        order = "hlabcdefgijkmnopqrstuvwxyz";
        expect = true;
        output = s.isAlienSorted(words, order);
        VerifyUtil.verify(expect, output, seq++);


        words = new String[]{"word", "world", "row"};
        order = "worldabcefghijkmnpqstuvxyz";
        expect = false;
        output = s.isAlienSorted(words, order);
        VerifyUtil.verify(expect, output, seq++);

        words = new String[]{"apple", "app"};
        order = "abcdefghijklmnopqrstuvwxyz";
        expect = false;
        output = s.isAlienSorted(words, order);
        VerifyUtil.verify(expect, output, seq++);

        words = new String[]{"kuvp", "q"};
        order = "ngxlkthsjuoqcpavbfdermiywz";
        expect = true;
        output = s.isAlienSorted(words, order);
        VerifyUtil.verify(expect, output, seq++);
    }
}
