package easy.e0994rottingoranges;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class RottingOrangesTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int[][] grid;
        int expect;
        int output;
        int seq=1;

        grid=new int[][]{{2,1,1},{1,1,0},{0,1,1}};
        expect=4;
        output=s.orangesRotting(grid);
        VerifyUtil.verify(expect,output,seq++);

        grid=new int[][]{{2,1,1},{0,1,1},{1,0,1}};
        expect=-1;
        output=s.orangesRotting(grid);
        VerifyUtil.verify(expect,output,seq++);

        grid=new int[][]{{2,0} };
        expect=0;
        output=s.orangesRotting(grid);
        VerifyUtil.verify(expect,output,seq++);

        grid=new int[][]{{0,2} };
        expect=0;
        output=s.orangesRotting(grid);
        VerifyUtil.verify(expect,output,seq++);

        grid=new int[][]{{1} };
        expect=-1;
        output=s.orangesRotting(grid);
        VerifyUtil.verify(expect,output,seq++);

        grid=new int[][]{{1},{2} };
        expect=1;
        output=s.orangesRotting(grid);
        VerifyUtil.verify(expect,output,seq++);

        grid=new int[][]{{0} };
        expect=0;
        output=s.orangesRotting(grid);
        VerifyUtil.verify(expect,output,seq++);

        grid=new int[][]{{1},{1},{1},{1} };
        expect=-1;
        output=s.orangesRotting(grid);
        VerifyUtil.verify(expect,output,seq++);

        grid=new int[][]{{0,0,0,1,1} };
        expect=-1;
        output=s.orangesRotting(grid);
        VerifyUtil.verify(expect,output,seq++);

        grid=new int[][]{{2},{2},{1},{0},{1},{1} };
        expect=-1;
        output=s.orangesRotting(grid);
        VerifyUtil.verify(expect,output,seq++);


    }
}
