package easy.e0914xofakindinadeckofcards;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class XofAKindInaDeckofCardsTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int[] deck;
        boolean expect;
        boolean output;
        int seq=1;

        deck=new int[]{1,2,3,4,4,3,2,1};
        expect=true;
       output=s.hasGroupsSizeX(deck);
       VerifyUtil.verify(expect,output,seq++);

        deck=new int[]{1,1,1,2,2,2,3,3};
        expect=false;
        output=s.hasGroupsSizeX(deck);
        VerifyUtil.verify(expect,output,seq++);

        deck=new int[]{1};
        expect=false;
        output=s.hasGroupsSizeX(deck);
        VerifyUtil.verify(expect,output,seq++);

        deck=new int[]{1,1,1,1,2,2,2,2,2,2};
        expect=true;
        output=s.hasGroupsSizeX(deck);
        VerifyUtil.verify(expect,output,seq++);
    }
}
