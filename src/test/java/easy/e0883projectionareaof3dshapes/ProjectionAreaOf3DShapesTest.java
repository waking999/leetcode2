package easy.e0883projectionareaof3dshapes;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class ProjectionAreaOf3DShapesTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int[][] grid;
        int expect;
        int output;
        int seq=1;

        grid=new int[][]{{2}};
        expect=5;
        output=s.projectionArea(grid);
        VerifyUtil.verify(expect,output,seq++);
       

        grid=new int[][]{{1,2},{3,4}};
        expect=17;
        output=s.projectionArea(grid);
        VerifyUtil.verify(expect,output,seq++);
        

        grid=new int[][]{{1,0},{0,2}};
        expect=8;
        output=s.projectionArea(grid);
        VerifyUtil.verify(expect,output,seq++);

        grid=new int[][]{{1,1,1},{1,0,1},{1,1,1}};
        expect=14;
        output=s.projectionArea(grid);
        VerifyUtil.verify(expect,output,seq++);

        grid=new int[][]{{2,2,2},{2,1,2},{2,2,2}};
        expect=21;
        output=s.projectionArea(grid);
        VerifyUtil.verify(expect,output,seq++);

    }
}
