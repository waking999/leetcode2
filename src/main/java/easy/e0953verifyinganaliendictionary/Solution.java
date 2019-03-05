package easy.e0953verifyinganaliendictionary;

public class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        if (words == null) {
            return true;
        }
        int wordsLen = words.length;
        if (wordsLen == 0 || wordsLen == 1) {
            return true;
        }

        char[] preChars = words[0].toCharArray();
        int preCharsLen = preChars.length;

        for (int i = 1; i < wordsLen; i++) {
            boolean next=false;
            char[] currChars = words[i].toCharArray();
            int currCharsLen = currChars.length;
            int minLen = Math.min(preCharsLen, currCharsLen);
            for (int j = 0; j < minLen; j++) {
                int preCharPos = order.indexOf(preChars[j]);
                int currCharPos = order.indexOf(currChars[j]);
                if (preCharPos < currCharPos) {
                    next=true;
                    break;
                }
                if (preCharPos > currCharPos) {
                    return false;
                }

            }
            if (!next&&currCharsLen < preCharsLen) {
                return false;
            }
            preChars = currChars;
            preCharsLen = currCharsLen;

        }

        return true;
    }
}
