package easy.e0475heaters;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class HeatersTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int[] houses;
        int[] heaters;
        int expect;
        int output;
        int seq = 1;

        houses = new int[]{1, 2, 3};
        heaters = new int[]{2};
        expect = 1;
        output = s.findRadius(houses, heaters);
        VerifyUtil.verify(expect, output, seq++);

        houses = new int[]{1, 2, 3, 4};
        heaters = new int[]{1, 4};
        expect = 1;
        output = s.findRadius(houses, heaters);
        VerifyUtil.verify(expect, output, seq++);

        houses = new int[]{1, 5};
        heaters = new int[]{2};
        expect = 3;
        output = s.findRadius(houses, heaters);
        VerifyUtil.verify(expect, output, seq++);

        houses = new int[]{1, 5};
        heaters = new int[]{10};
        expect = 9;
        output = s.findRadius(houses, heaters);
        VerifyUtil.verify(expect, output, seq++);


    }
}
