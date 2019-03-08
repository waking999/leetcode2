package easy.e0482licensekeyformatting;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class LicenseKeyFormattingTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        String S;
        int K;
        String expect;
        String output;
        int seq=1;


        S = "5F3Z-2e-9-w";
        K = 4;
        expect="5F3Z-2E9W";
        output=s.licenseKeyFormatting(S,K);
        VerifyUtil.verify(expect,output,seq++);

        S = "2-5g-3-J";
        K = 2;
        expect="2-5G-3J";
        output=s.licenseKeyFormatting(S,K);
        VerifyUtil.verify(expect,output,seq++);

        S = "---";
        K = 3;
        expect="";
        output=s.licenseKeyFormatting(S,K);
        VerifyUtil.verify(expect,output,seq++);
    }
}
