package easy.e0383ransomnote;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class RansomNoteTest {
    @Test
    public   void test1() {
        Solution s=new Solution();

        String ransomNote;
        String magazine;
        boolean expect;
        boolean output;
        int seq=1;

        ransomNote="a";
        magazine="b";
        expect= false;
        output=s.canConstruct(ransomNote, magazine);
        VerifyUtil.verify(expect,output,seq++);

        ransomNote="aa";
        magazine="ab";
        expect= false;
        output=s.canConstruct(ransomNote, magazine);
        VerifyUtil.verify(expect,output,seq++);

        ransomNote="aa";
        magazine="aab";
        expect= true;
        output=s.canConstruct(ransomNote, magazine);
        VerifyUtil.verify(expect,output,seq++);

        ransomNote="";
        magazine="";
        expect= true;
        output=s.canConstruct(ransomNote, magazine);
        VerifyUtil.verify(expect,output,seq++);

    }
}
