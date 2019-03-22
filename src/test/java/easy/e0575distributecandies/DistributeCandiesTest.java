package easy.e0575distributecandies;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class DistributeCandiesTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int[] candies;
        int expect;
        int output;
        int seq = 1;

        candies = new int[]{1, 1, 2, 2, 3, 3};
        expect = 3;
        output = s.distributeCandies(candies);
        VerifyUtil.verify(expect, output, seq++);

        candies = new int[]{1, 1, 2, 3};
        expect = 2;
        output = s.distributeCandies(candies);
        VerifyUtil.verify(expect, output, seq++);


    }
}
