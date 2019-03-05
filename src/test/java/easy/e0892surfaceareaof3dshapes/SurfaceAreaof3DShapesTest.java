package easy.e0892surfaceareaof3dshapes;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class SurfaceAreaof3DShapesTest {
    @Test
    public void test1(){
        Solution s=new Solution();
        int[][] grid;
        int expect;
        int output;
        int seq=1;

        grid=new int[][]{{2}};
        expect= 10;
        output=s.surfaceArea(grid);
        VerifyUtil.verify(expect,output,seq++);

        grid=new int[][]{{1,2},{3,4}};
        expect= 34;
        output=s.surfaceArea(grid);
        VerifyUtil.verify(expect,output,seq++);
        
        grid=new int[][]{{1,0},{0,2}};
        expect= 16;
        output=s.surfaceArea(grid);
        VerifyUtil.verify(expect,output,seq++);

        grid=new int[][]{{1,1,1},{1,0,1},{1,1,1}};
        expect= 32;
        output=s.surfaceArea(grid);
        VerifyUtil.verify(expect,output,seq++);

        grid=new int[][]{{2,2,2},{2,1,2},{2,2,2}};
        expect= 46;
        output=s.surfaceArea(grid);
        VerifyUtil.verify(expect,output,seq++);
    }
}
