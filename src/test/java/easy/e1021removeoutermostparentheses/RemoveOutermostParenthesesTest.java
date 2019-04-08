package easy.e1021removeoutermostparentheses;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class RemoveOutermostParenthesesTest {
    @Test
    public void test1(){
        Solution s=new Solution();

        String str;
        String expect;
        String output;
        int seq=1;

        str="(()())(())";
        expect="()()()";
        output=s.removeOuterParentheses(str);
        VerifyUtil.verify(expect,output,seq++);

        str="(()())(())(()(()))";
        expect="()()()()(())";
        output=s.removeOuterParentheses(str);
        VerifyUtil.verify(expect,output,seq++);

        str="()()";
        expect="";
        output=s.removeOuterParentheses(str);
        VerifyUtil.verify(expect,output,seq++);

    }
}
