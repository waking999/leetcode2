package medium.m0779kthsymbolingrammar;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class KthSymbolInGrammarTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int N;
        int K;
        int expect;
        int output;
        int seq = 1;

        N = 1;
        K = 1;
        expect = 0;
        output = s.kthGrammar(N, K);
        VerifyUtil.verify(expect, output, seq++);

        N = 2;
        K = 1;
        expect = 0;
        output = s.kthGrammar(N, K);
        VerifyUtil.verify(expect, output, seq++);

        N = 2;
        K = 2;
        expect = 1;
        output = s.kthGrammar(N, K);
        VerifyUtil.verify(expect, output, seq++);

        N = 4;
        K = 5;
        expect = 1;
        output = s.kthGrammar(N, K);
        VerifyUtil.verify(expect, output, seq++);

        N = 3;
        K = 3;
        expect = 1;
        output = s.kthGrammar(N, K);
        VerifyUtil.verify(expect, output, seq++);


        N = 30;
        K = 434991989;
        expect = 0;
        output = s.kthGrammar(N, K);
        VerifyUtil.verify(expect, output, seq++);


    }
}
