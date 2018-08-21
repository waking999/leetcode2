package medium.m0890findandreplacepattern.s02;

import java.util.*;

public class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> rtn = new ArrayList<>();

        int pLen = pattern.length();
        char[] pChars = pattern.toCharArray();

        Arrays.asList(words).parallelStream().filter(w -> filter(w, pChars, pLen)).forEach(w -> rtn.add(w));

        return rtn;
    }

    private boolean filter(String w, char[] pChars, int pLen) {
        int wLen = w.length();
        if (wLen % pLen != 0) {
            return false;
        }
        char[] wChars = w.toCharArray();
        Map<Character, Character> pwMap = new HashMap<>();
        Map<Character, Character> wpMap = new HashMap<>();
        int round = wLen / pLen;

        for (int i = 0; i < round; i++) {
            int start = i * pLen;
            for (int j = 0; j < pLen; j++) {
                if (pwMap.containsKey(pChars[j])) {
                    char wVal = pwMap.get(pChars[j]);
                    if (wVal != wChars[start + j]) {
                        return false;
                    }
                } else {
                    if (wpMap.containsKey(wChars[start + j])) {
                        return false;
                    }

                    pwMap.put(pChars[j], wChars[start + j]);
                    wpMap.put(wChars[start + j], pChars[j]);
                }
            }
        }


        return true;
    }
}
