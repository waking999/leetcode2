package medium.m0890findandreplacepattern.s01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> rtn = new ArrayList<>();

        int pLen = pattern.length();
        char[] pChars = pattern.toCharArray();


        for (String w : words) {
            int wLen = w.length();
            if (wLen % pLen == 0) {
                char[] wChars = w.toCharArray();
                Map<Character, Character> pwMap = new HashMap<>();
                Map<Character, Character> wpMap = new HashMap<>();
                int round = wLen / pLen;
                outer:
                for (int i = 0; i < round; i++) {
                    int start = i * pLen;
                    for (int j = 0; j < pLen; j++) {
                        if (pwMap.containsKey(pChars[j])) {
                            char wVal = pwMap.get(pChars[j]);
                            if (wVal != wChars[start + j]) {
                                break outer;
                            }
                        }else {
                            if(wpMap.containsKey(wChars[start+j])){
                                break outer;
                            }

                            pwMap.put(pChars[j], wChars[start + j]);
                            wpMap.put( wChars[start + j],pChars[j]);
                        }
                    }
                    rtn.add(w);
                }


            }
        }


        return rtn;
    }
}
