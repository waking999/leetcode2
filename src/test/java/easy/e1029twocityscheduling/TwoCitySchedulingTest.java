package easy.e1029twocityscheduling;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class TwoCitySchedulingTest {
    @Test
    public void test1(){
        Solution s=new Solution();


        int[][] costs;
        int expect;
        int output;
        int seq=1;


        costs=new int[][]{{10,20},{30,200},{400,50},{30,20}};
        expect=110;
        output=s.twoCitySchedCost(costs);
        VerifyUtil.verify(expect,output,seq++);

        costs=new int[][]{{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};
        expect=1859;
        output=s.twoCitySchedCost(costs);
        VerifyUtil.verify(expect,output,seq++);

    }
}
