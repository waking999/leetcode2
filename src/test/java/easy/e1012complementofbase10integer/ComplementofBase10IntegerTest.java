package easy.e1012complementofbase10integer;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class ComplementofBase10IntegerTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        int N;
        int expect;
        int output;
        int seq=1;

        N=5;
        expect=2;
        output=s.bitwiseComplement(N);
        VerifyUtil.verify(expect,output,seq++);

        N=7;
        expect=0;
        output=s.bitwiseComplement(N);
        VerifyUtil.verify(expect,output,seq++);

        N=10;
        expect=5;
        output=s.bitwiseComplement(N);
        VerifyUtil.verify(expect,output,seq++);
    }
}
