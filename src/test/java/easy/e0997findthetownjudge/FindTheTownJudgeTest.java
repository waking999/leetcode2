package easy.e0997findthetownjudge;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class FindTheTownJudgeTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int N;
        int[][] trust;
        int expect;
        int output;
        int seq=0;

        N=4;
        trust=new int[][]{{1,3},{1,4},{2,3},{2,4},{4,3}};
        expect=3;
        output=s.findJudge(N,trust);
        VerifyUtil.verify(expect,output,seq++);

        N=3;
        trust=new int[][]{{1,2},{2,3}};
        expect=-1;
        output=s.findJudge(N,trust);
        VerifyUtil.verify(expect,output,seq++);


        N=3;
        trust=new int[][]{{1,3},{2,3},{3,1}};
        expect=-1;
        output=s.findJudge(N,trust);
        VerifyUtil.verify(expect,output,seq++);


        N=3;
        trust=new int[][]{{1,3},{2,3}};
        expect=3;
        output=s.findJudge(N,trust);
        VerifyUtil.verify(expect,output,seq++);


        N=2;
        trust=new int[][]{{1,2}};
        expect=2;
        output=s.findJudge(N,trust);
        VerifyUtil.verify(expect,output,seq++);

    }
}
