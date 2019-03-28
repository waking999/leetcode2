package medium.m0648replacewords;

import common.VerifyUtil;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ReplaceWordsTest {
    @Test
    public void test1() {
        Solution s = new Solution();


        String[] dictStr;
        List<String> dict;
        String sentence;
        String output;
        String expect;
        int seq = 1;

        dictStr = new String[]{"cat", "bat", "rat"};
        dict = Arrays.asList(dictStr);
        sentence = "the cattle was rattled by the battery";
        expect = "the cat was rat by the bat";
        output = s.replaceWords(dict, sentence);
        VerifyUtil.verify(expect, output, seq++);

        dictStr = new String[]{"cat", "bat", "rat"};
        dict = Arrays.asList(dictStr);
        sentence = "the cattle was rattled by the battery catttle";
        expect = "the cat was rat by the bat cat";
        output = s.replaceWords(dict, sentence);
        VerifyUtil.verify(expect, output, seq++);

        dictStr = new String[]{"a", "aa", "aaa", "aaaa"};
        dict = Arrays.asList(dictStr);
        sentence = "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa";
        expect = "a a a a a a a a bbb baba a";
        output = s.replaceWords(dict, sentence);
        VerifyUtil.verify(expect, output, seq++);


        dictStr = new String[]{"e", "k", "c", "harqp", "h", "gsafc", "vn", "lqp", "soy", "mr", "x", "iitgm", "sb", "oo", "spj", "gwmly", "iu", "z", "f", "ha", "vds", "v", "vpx", "fir", "t", "xo", "apifm", "tlznm", "kkv", "nxyud", "j", "qp", "omn", "zoxp", "mutu", "i", "nxth", "dwuer", "sadl", "pv", "w", "mding", "mubem", "xsmwc", "vl", "farov", "twfmq", "ljhmr", "q", "bbzs", "kd", "kwc", "a", "buq", "sm", "yi", "nypa", "xwz", "si", "amqx", "iy", "eb", "qvgt", "twy", "rf", "dc", "utt", "mxjfu", "hm", "trz", "lzh", "lref", "qbx", "fmemr", "gil", "go", "qggh", "uud", "trnhf", "gels", "dfdq", "qzkx", "qxw"};
        dict = Arrays.asList(dictStr);
        sentence = "i miszkays w gvcfldkiavww v dvypwyb bxahfzcfanteibiltins ueebf lqhflvwxksi dc k w ytzzlm gximjuhzfdjuamhsu gdkbmhpnvy i mengfdydekwttkhbzenk w h ldipovluo a nusquzpmnogtjkklfhta k nxzgnrveghc mpppfhzjkbucv c uwmahhqradjtf i z q yzfragcextvx i i j gzixfeugj rnukjgtjpim h a x h ygelddphxnbh rvjxtlqfnlmwdoezh z i bbfj mhs nenrqfkbf spfpazr w c dtd c dtaxhddidfwqs bgnnoxgyynol h dijhrrpnwjlju muzzrrsypzgwvblf z h q i daee r nlipyfszvxlwqw yoq dewpgtcrzausqwhh q i k bqprarpgnyemzwifqzz oai pnqottd nygesjtlpala q gyvukjpc s mxhlkdaycskj uvwmerplaibeknltuvd ocnn f c pxbd oklwhcppuziixpvihihp";
        expect = "i miszkays w gvcfldkiavww v dvypwyb bxahfzcfanteibiltins ueebf lqhflvwxksi dc k w ytzzlm gximjuhzfdjuamhsu gdkbmhpnvy i mengfdydekwttkhbzenk w h ldipovluo a nusquzpmnogtjkklfhta k nxzgnrveghc mpppfhzjkbucv c uwmahhqradjtf i z q yzfragcextvx i i j gzixfeugj rnukjgtjpim h a x h ygelddphxnbh rvjxtlqfnlmwdoezh z i bbfj mhs nenrqfkbf spfpazr w c dtd c dtaxhddidfwqs bgnnoxgyynol h dijhrrpnwjlju muzzrrsypzgwvblf z h q i daee r nlipyfszvxlwqw yoq dewpgtcrzausqwhh q i k bqprarpgnyemzwifqzz oai pnqottd nygesjtlpala q gyvukjpc s mxhlkdaycskj uvwmerplaibeknltuvd ocnn f c pxbd oklwhcppuziixpvihihp";
        output = s.replaceWords(dict, sentence);
        VerifyUtil.verify(expect, output, seq++);


    }
}
