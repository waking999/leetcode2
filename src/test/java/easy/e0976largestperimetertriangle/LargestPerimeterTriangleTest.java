package easy.e0976largestperimetertriangle;


import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class LargestPerimeterTriangleTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        int[] A;
        int expect;
        int output;
        int seq=1;

        A=new int[]{2,1,2};
        expect=5;
        output=s.largestPerimeter(A);
        VerifyUtil.verify(expect,output,seq++);


        A=new int[]{1,2,1};
        expect=0;
        output=s.largestPerimeter(A);
        VerifyUtil.verify(expect,output,seq++);

        A=new int[]{3,2,3,4};
        expect=10;
        output=s.largestPerimeter(A);
        VerifyUtil.verify(expect,output,seq++);

        A=new int[]{3,6,2,3};
        expect=8;
        output=s.largestPerimeter(A);
        VerifyUtil.verify(expect,output,seq++);
    }
}
