package easy.e0720longestwordindictionary;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class LongestWordinDictionaryTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        String[] words;
        String expect;
        String output;
        int seq = 0;

        words = new String[]{"w", "wo", "wor", "worl", "world"};
        expect = "world";
        output = s.longestWord(words);
        VerifyUtil.verify(expect, output, seq++);

        words = new String[]{"a", "banana", "app", "appl", "ap", "apply", "apple"};
        expect = "apple";
        output = s.longestWord(words);
        VerifyUtil.verify(expect, output, seq++);

        words = new String[]{"m", "mo", "moc", "moch", "mocha", "l", "la", "lat", "latt", "latte", "c", "ca", "cat"};
        expect = "latte";
        output = s.longestWord(words);
        VerifyUtil.verify(expect, output, seq++);

    }
}
