package easy.e0937reorderlogfiles;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class ReorderLogFilesTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        String[] logs;
        String[] expect;
        String[] output;
        int seq=1;

        logs=new String[]{"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};
        expect=new String[]{"g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"};
        output=s.reorderLogFiles(logs);
        VerifyUtil.verifyUnsort(expect,output,seq++);



    }
}
