package medium.m0211addandsearchworddatastructuredesign;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class AddandSearchWordDatastructuredesignTest {
    @Test
    public void test1(){
        WordDictionary s=new WordDictionary();

        String word;
        boolean expect;
        boolean output;
        int seq=1;

        word="bad";
        s.addWord(word);

        word="dad";
        s.addWord(word);

        word="mad";
        s.addWord(word);

        word="pad";
        expect=false;
        output=s.search(word);
        VerifyUtil.verify(expect,output,seq++);

        word="bad";
        expect=true;
        output=s.search(word);
        VerifyUtil.verify(expect,output,seq++);

        word=".ad";
        expect=true;
        output=s.search(word);
        VerifyUtil.verify(expect,output,seq++);

        word="b..";
        expect=true;
        output=s.search(word);
        VerifyUtil.verify(expect,output,seq++);


    }


    @Test
    public void test2() {
        String[] operations = new String[]{"WordDictionary","addWord","addWord","search","search","search","search","search","search"};
        String[][] params = new String[][]{{},{"a"},{"a"},{"."},{"a"},{"aa"},{"a"},{".a"},{"a."}};
        Boolean[] expects = new Boolean[]{null,null,null,true,true,false,true,false,false};
        runTest(operations, params, expects);
    }


    @Test
    public void test3() {
        String[] operations = new String[]{"WordDictionary","addWord","addWord","addWord","addWord","search","search","addWord","search","search","search","search","search","search"};
        String[][] params = new String[][]{{},{"at"},{"and"},{"an"},{"add"},{"a"},{".at"},{"bat"},{".at"},{"an."},{"a.d."},{"b."},{"a.d"},{"."}};
        Boolean[] expects = new Boolean[]{null,null,null,null,null,false,false,null,true,true,false,false,true,false};
        runTest(operations, params, expects);
    }

    private void runTest(String[] operations, String[][] params, Boolean[] expects) {
        WordDictionary s = null;
        int seq = 1;

        int len = operations.length;
        for (int i = 0; i < len; i++) {
            String op = operations[i];
            String[] param = params[i];
            if ("WordDictionary".equals(op)) {
                s = new WordDictionary();
            } else if ("addWord".equals(op)) {
                s.addWord(param[0]);
            } else if ("search".equals(op)) {
                boolean output = s.search(param[0]);
                boolean expect = expects[i];
                VerifyUtil.verify(expect, output, seq++);
            }
        }

    }
}
