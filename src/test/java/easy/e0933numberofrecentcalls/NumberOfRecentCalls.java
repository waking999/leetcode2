package easy.e0933numberofrecentcalls;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class NumberOfRecentCalls {
    @Test

    public void test1() {
        Solution s = new Solution();

        int[] inputs;
        int[] expect;
        int[] output;
        int seq = 1;

        inputs = new int[]{1, 100, 3001, 3002};
        expect = new int[]{1, 2, 3, 3};
        output = s.pin(inputs);
        VerifyUtil.verifyUnsort(expect, output, seq++);
    }
}
