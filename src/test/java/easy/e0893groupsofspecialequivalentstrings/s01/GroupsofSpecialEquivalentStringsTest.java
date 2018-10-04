package easy.e0893groupsofspecialequivalentstrings.s01;


import common.VerifyUtil;
import org.junit.jupiter.api.Test;

public class GroupsofSpecialEquivalentStringsTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        String[] A;
        int expect;
        int output;
        int seq=1;

        A=new String[]{"a","b","c","a","c","c"};
        expect=3;
        output=s.numSpecialEquivGroups(A);
        VerifyUtil.verify(expect,output,seq++);

        A=new String[]{"aa","bb","ab","ba"};
        expect=4;
        output=s.numSpecialEquivGroups(A);
        VerifyUtil.verify(expect,output,seq++);

        A=new String[]{"abc","acb","bac","bca","cab","cba"};
        expect=3;
        output=s.numSpecialEquivGroups(A);
        VerifyUtil.verify(expect,output,seq++);

        A=new String[]{"abcd","cdab","adcb","cbad"};
        expect=1;
        output=s.numSpecialEquivGroups(A);
        VerifyUtil.verify(expect,output,seq++);

        A=new String[]{"demp","cfhp","dzvf","ggxe","hkte","clug","nhgk","hvwj","zozr","datm","hisr","gfry","jknr","laju","emsf","duwe","ilta","gjrd","woaq","zhdm","ujmz","jalu","tkhe","gexg","hrsi","tail","ilta","xegg","srhi","clug","cgul","gexg","tehk","ulcg","xgge","cgul","hrsi","aowq","jalu","laju","vzdf","gexg","hpcf","zhdm","hfcp","zhdm","ulcg","jalu","ggxe","gexg","nkgh","hrsi","vfdz","nkgh","cgul","hpcf","hetk","zrzo","xegg","nkgh","srhi","smef","ulcg","hrsi","ggxe","ggxe","efsm","ggxe","jalu","srhi","dmzh","laju","zmdh","sfem","tehk","srhi","wqao","gknh","jalu","iatl","gexg","ugcl","nkgh","hrsi","srhi","hkte","gdrj","zozr","hisr","sihr","smef","zmdh","clug","iatl","cgul","woaq","jrnk","sihr","xegg","luja"};
        expect=21;
        output=s.numSpecialEquivGroups(A);
        VerifyUtil.verify(expect,output,seq++);
    }
}
