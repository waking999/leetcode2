package medium.m0890findandreplacepattern.s01;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FindAndReplacePatternTest {
    @Test
    public void test1() {
        medium.m0890findandreplacepattern.s01.Solution s = new  medium.m0890findandreplacepattern.s01.Solution();

        String[] words;
        String pattern;
        String[] expect;
        List<String> output;
        int seq = 1;

        words = new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        pattern = "abb";
        expect = new String[]{"mee", "aqq"};
        output = s.findAndReplacePattern(words, pattern);
        VerifyUtil.verifySort(expect,output,seq++);
    }


    @Test
    public void test2() {
        medium.m0890findandreplacepattern.s02.Solution s = new  medium.m0890findandreplacepattern.s02.Solution();

        String[] words;
        String pattern;
        String[] expect;
        List<String> output;
        int seq = 1;

        words = new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        pattern = "abb";
        expect = new String[]{"mee", "aqq"};
        output = s.findAndReplacePattern(words, pattern);
        VerifyUtil.verifySort(expect,output,seq++);
    }
}
