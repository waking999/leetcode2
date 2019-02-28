package easy.e0970powerfulintegers;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PowerfulIntegersTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int x;
        int y;
        int bound;
        int[] expect;
        List<Integer> output;
        int seq=1;

        x = 2;
        y = 3;
        bound = 10;
        expect = new int[]{2, 3, 4, 5, 7, 9, 10};
        output = s.powerfulIntegers(x, y, bound);
        VerifyUtil.verifySort(expect, output, seq++);

        x = 3;
        y = 5;
        bound = 15;
        expect = new int[]{2, 4, 6, 8, 10, 14};
        output = s.powerfulIntegers(x, y, bound);
        VerifyUtil.verifySort(expect, output, seq++);

        x = 1;
        y = 1;
        bound = 0;
        expect = new int[]{};
        output = s.powerfulIntegers(x, y, bound);
        VerifyUtil.verifySort(expect, output, seq++);

        x=1;
        y=2;
        bound=100;
        expect=new int[]{2,3,5,9,17,33,65};
        output=s.powerfulIntegers(x,y,bound);
        VerifyUtil.verifySort(expect,output,seq++);


    }
}
