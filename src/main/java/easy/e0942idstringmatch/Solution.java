package easy.e0942idstringmatch;

import java.util.Arrays;

public class Solution {
    public int[] diStringMatch(String S) {
        int sLen = S.length();
        int left = 0;
        int right = sLen;

        int[] rtn = new int[sLen + 1];

        for (int i = 0; i < sLen; i++) {
            rtn[i] = S.charAt(i) == 'I' ? left++ : right--;
        }
        rtn[sLen] = left;


        return rtn;

    }


}
