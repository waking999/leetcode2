package easy.e0860lemonadechange;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class LemonadeChangeTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int[] bills;
        boolean expect;
        boolean output;
        int seq=1;

        bills=new int[]{5,5,5,10,20};
        expect=true;
        output=s.lemonadeChange(bills);
        VerifyUtil.verify(expect,output,seq++);



        bills=new int[]{5,5,10};
        expect=true;
        output=s.lemonadeChange(bills);
        VerifyUtil.verify(expect,output,seq++);


        bills=new int[]{5,5,10,10,20};
        expect=false;
        output=s.lemonadeChange(bills);
        VerifyUtil.verify(expect,output,seq++);



        bills=new int[]{5,5,5,10,20};
        expect=true;
        output=s.lemonadeChange(bills);
        VerifyUtil.verify(expect,output,seq++);

        bills=new int[]{5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5};
        expect=true;
        output=s.lemonadeChange(bills);
        VerifyUtil.verify(expect,output,seq++);


    }
}
