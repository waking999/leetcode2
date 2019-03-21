package easy.e1013pairsofsongswithtotaldurationsdivisibleby60;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class PairsofSongsWithTotalDurationsDivisibleby60Test {
    @Test
    public void test1(){
        Solution s=new Solution();

        int[] time;
        int expect;
        int output;
        int seq=1;

        time=new int[]{30,20,150,100,40};
        expect=3;
        output=s.numPairsDivisibleBy60(time);
        VerifyUtil.verify(expect,output,seq++);

        time=new int[]{60,60,60};
        expect=3;
        output=s.numPairsDivisibleBy60(time);
        VerifyUtil.verify(expect,output,seq++);
    }
}
