package easy.e0438findallanagramsinastring;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        int pLen = p.length();
        int lPointer = 0;
        int rPointer = 0;

        int[] pCharCount = new int[26];

        for (int i = 0; i <pLen; i++) {
            pCharCount[p.charAt(i)-'a']++;
        }

        int sLen=s.length();
        int length=pLen;
        while (rPointer < sLen) {
            if (pCharCount[s.charAt(rPointer++)-'a']-- > 0){
                length--;
            }

            if (length == 0) {
                res.add(lPointer);
            }

            if (rPointer - lPointer == pLen && pCharCount[s.charAt(lPointer++)-'a']++ >= 0) {
                length++;
            }
        }

        return res;
    }
}
