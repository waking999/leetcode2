package easy.e0551studentattendancerecordi;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class StudentAttendanceRecordITest {
    @Test
    public void test1() {
        Solution s = new Solution();

        String str;
        boolean expect;
        boolean output;
        int seq=1;

        str = "PPALLP";
        expect = true;
        output = s.checkRecord(str);
        VerifyUtil.verify(expect, output, seq++);

        str = "PPALLL";
        expect = false;
        output = s.checkRecord(str);
        VerifyUtil.verify(expect, output, seq++);

    }
}
