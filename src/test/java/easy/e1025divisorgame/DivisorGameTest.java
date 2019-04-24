package easy.e1025divisorgame;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class DivisorGameTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int N;
        boolean expect;
        boolean output;
        int seq=1;

        N=2;
        expect=true;
        output=s.divisorGame(N);
        VerifyUtil.verify(expect, output,seq++);

        N=3;
        expect=false;
        output=s.divisorGame(N);
        VerifyUtil.verify(expect, output,seq++);

        N=5;
        expect=false;
        output=s.divisorGame(N);
        VerifyUtil.verify(expect, output,seq++);


        N=4;
        expect=true;
        output=s.divisorGame(N);
        VerifyUtil.verify(expect, output,seq++);
    }
}
