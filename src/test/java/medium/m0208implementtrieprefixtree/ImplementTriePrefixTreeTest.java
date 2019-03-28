package medium.m0208implementtrieprefixtree;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class ImplementTriePrefixTreeTest {
    @Test
    public void test1(){
        Trie trie=new Trie();

        String word;
        String prefix;
        boolean expect;
        boolean output;
        int seq=1;


        word="apple";
        trie.insert("apple");


        word="apple";
        expect=true;
        output=trie.search("apple");
        VerifyUtil.verify(expect,output,seq++);

        word="app";
        expect=false;
        output=trie.search("app");
        VerifyUtil.verify(expect,output,seq++);

        prefix="app";
        expect=true;
        output=trie.startsWith("app");
        VerifyUtil.verify(expect,output,seq++);

        word="app";
        trie.insert("app");

        word="app";
        expect=true;
        output=trie.search("app");
        VerifyUtil.verify(expect,output,seq++);

    }
}
