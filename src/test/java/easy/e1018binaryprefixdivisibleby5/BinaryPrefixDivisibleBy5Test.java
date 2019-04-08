package easy.e1018binaryprefixdivisibleby5;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BinaryPrefixDivisibleBy5Test {
    @Test
    public void test1(){
        Solution s=new Solution();

        int[] A;
        Boolean[] expect;
        List<Boolean> output;
        int seq=1;

        A=new int[]{0,1,1};
        expect=new Boolean[]{true,false,false};
        output=s.prefixesDivBy5(A);
        VerifyUtil.verifyUnSort(expect,output,seq++);


        A=new int[]{1,1,1};
        expect=new Boolean[]{false,false,false};
        output=s.prefixesDivBy5(A);
        VerifyUtil.verifyUnSort(expect,output,seq++);

        A=new int[]{0,1,1,1,1,1};
        expect=new Boolean[]{true,false,false,false,true,false};
        output=s.prefixesDivBy5(A);
        VerifyUtil.verifyUnSort(expect,output,seq++);

        A=new int[]{1,1,1,0,1};
        expect=new Boolean[]{false,false,false,false,false};
        output=s.prefixesDivBy5(A);
        VerifyUtil.verifyUnSort(expect,output,seq++);

        A=new int[]{1,0,1,1,1,1,0,0,0,0,1,0,0,0,0,0,1,0,0,1,1,1,1,1,0,0,0,0,1,1,1,0,0,0,0,0,1,0,0,0,1,0,0,1,1,1,1,1,1,0,1,1,0,1,0,0,0,0,0,0,1,0,1,1,1,0,0,1,0};
        expect=new Boolean[]{false,false,true,false,false,false,false,false,false,false,true,true,true,true,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,false,false,false,true,false,false,true,false,false,true,true,true,true,true,true,true,false,false,true,false,false,false,false,true,true};
        output=s.prefixesDivBy5(A);
        VerifyUtil.verifyUnSort(expect,output,seq++);


    }
}
