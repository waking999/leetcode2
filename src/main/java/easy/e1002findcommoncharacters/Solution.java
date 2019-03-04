package easy.e1002findcommoncharacters;

import java.util.*;

public class Solution {
    public List<String> commonChars(String[] A) {
        List<String> rtn = new ArrayList<>();

        if (A == null) {
            return rtn;
        }

        int aLen = A.length;


        int[] arrayCharCount = new int[26];
        Arrays.fill(arrayCharCount, Integer.MAX_VALUE);

        for (String str : A) {
            char[] chars = str.toCharArray();
            int[] eachCharCount = new int[26];
            for (char ch : chars) {
                eachCharCount[ch - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                arrayCharCount[i] = Math.min(arrayCharCount[i], eachCharCount[i]);
            }
        }

        for (int i = 0; i < 26; i++) {
            while (arrayCharCount[i] > 0) {
                rtn.add(Character.toString((char) (i + 'a')));
                arrayCharCount[i]--;
            }
        }


        return rtn;
    }
}
