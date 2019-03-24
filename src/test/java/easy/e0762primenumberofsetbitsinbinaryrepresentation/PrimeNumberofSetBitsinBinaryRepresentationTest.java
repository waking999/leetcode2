package easy.e0762primenumberofsetbitsinbinaryrepresentation;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class PrimeNumberofSetBitsinBinaryRepresentationTest {
    @Test
    public void test1(){
        Solution s=new Solution();
        int L;
        int R;
        int expect;
        int output;
        int seq=1;

        L = 6;
        R = 10;
        expect= 4;
        output=s.countPrimeSetBits(L,R);
        VerifyUtil.verify(expect,output,seq++);

        L = 10;
        R = 15;
        expect= 5;
        output=s.countPrimeSetBits(L,R);
        VerifyUtil.verify(expect,output,seq++);

    }
}
