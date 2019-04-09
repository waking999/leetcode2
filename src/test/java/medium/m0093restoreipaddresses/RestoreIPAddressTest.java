package medium.m0093restoreipaddresses;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RestoreIPAddressTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        String str;
        String[] expect;
        List<String> output;
        int seq=1;

        str="25525511135";
        expect=new String[]{"255.255.11.135", "255.255.111.35"};
        output=s.restoreIpAddresses(str);
        VerifyUtil.verifySort(expect,output,seq++);


        str="0000";
        expect=new String[]{"0.0.0.0"};
        output=s.restoreIpAddresses(str);
        VerifyUtil.verifySort(expect,output,seq++);

        str="010010";
        expect=new String[]{"0.10.0.10","0.100.1.0"};
        output=s.restoreIpAddresses(str);
        VerifyUtil.verifySort(expect,output,seq++);

        str="172162541";
        expect=new String[]{"17.216.25.41","17.216.254.1","172.16.25.41","172.16.254.1","172.162.5.41","172.162.54.1"};
        output=s.restoreIpAddresses(str);
        VerifyUtil.verifySort(expect,output,seq++);
    }
}
