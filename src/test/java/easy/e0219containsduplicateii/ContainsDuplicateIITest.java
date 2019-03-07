package easy.e0219containsduplicateii;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class ContainsDuplicateIITest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int[] nums;
        int k;
        boolean expect;
        boolean output;
        int seq = 1;

        nums = new int[]{1, 2, 3, 4, 1, 5};
        k = 4;
        expect = true;
        output = s.containsNearbyDuplicate(nums, k);
        VerifyUtil.verify(expect, output, seq++);

        nums = new int[]{1, 2, 3, 4, 1, 5};
        k = 2;
        expect = false;
        output = s.containsNearbyDuplicate(nums, k);
        VerifyUtil.verify(expect, output, seq++);

        nums = new int[]{1, 2, 3, 4, 6, 5};
        k = 4;
        expect = false;
        output = s.containsNearbyDuplicate(nums, k);
        VerifyUtil.verify(expect, output, seq++);

        nums = new int[]{1, 0, 1, 1};
        k = 1;
        expect = true;
        output = s.containsNearbyDuplicate(nums, k);
        VerifyUtil.verify(expect, output, seq++);

        nums = new int[]{1, 2, 1};
        k = 1;
        expect = false;
        output = s.containsNearbyDuplicate(nums, k);
        VerifyUtil.verify(expect, output, seq++);


        nums = new int[]{99,99};
        k = 2;
        expect = true;
        output = s.containsNearbyDuplicate(nums, k);
        VerifyUtil.verify(expect, output, seq++);

    }
}
