package easy.e0973kclosestpointstoorigin;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class KClosestPointstoOriginTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int[][] points;
        int K;
        int[][] expect;
        int[][] output;
        int seq=1;

        points=new int[][]{{1,3},{-2,2}};
        K=1;
        expect=new int[][]{{-2,2}};
        output=s.kClosest(points,K);
        VerifyUtil.verifyUnsort(expect,output,seq++);


        points=new int[][]{{3,3},{5,-1},{-2,4}};
        K=2;
        expect=new int[][]{{3,3},{-2,4}};
        output=s.kClosest(points,K);
        VerifyUtil.verifyUnsort(expect,output,seq++);

    }
}
