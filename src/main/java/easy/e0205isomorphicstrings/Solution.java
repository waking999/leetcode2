package easy.e0205isomorphicstrings;

import java.util.Arrays;


public class Solution {
    private static final char NUL_CHAR = (char) 0;

    public boolean isIsomorphic(String s, String t) {
        int sLen = s.length();

        char[] s2t = new char[128];
        char[] t2s = new char[128];
        Arrays.fill(s2t, NUL_CHAR);
        Arrays.fill(t2s, NUL_CHAR);

        for (int i = 0; i < sLen; i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);


            if (s2t[sChar] != NUL_CHAR) {
                if (s2t[sChar] != tChar) {
                    return false;
                }
            } else {
                s2t[sChar] = tChar;
            }


            if (t2s[tChar] != NUL_CHAR) {
                if (t2s[tChar] != sChar) {
                    return false;
                }
            }else {
                t2s[tChar] = sChar;
            }

        }


        return true;
    }
}
