package easy.e0784lettercasepermutation;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> letterCasePermutation(String S) {

        char[] chars = S.toCharArray();

        List<String> rtn = new ArrayList<>();

        permutation(chars, 0, rtn);

        return rtn;

    }


    private void permutation(char[] chars, int pos, List<String> rtn) {
        if (pos == chars.length) {
            String tmp = new String(chars);
            rtn.add(tmp);
            return;
        } else {
            if (isLetter(chars[pos])) {
                chars[pos] = Character.toLowerCase(chars[pos]);
                permutation(chars, pos + 1, rtn);
                chars[pos] = Character.toUpperCase(chars[pos]);
                permutation(chars, pos + 1, rtn);
            } else {
                permutation(chars, pos + 1, rtn);
            }


        }


    }
    private boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z');
    }

//    private boolean isLowerCaseLetter(char c) {
//        return c >= 'a' && c <= 'z';
//    }
//
//    private boolean isUpperCaseLetter(char c) {
//        return c >= 'A' && c <= 'Z';
//    }
}
