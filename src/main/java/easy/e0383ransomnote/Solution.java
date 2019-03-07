package easy.e0383ransomnote;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null) {
            return true;
        }
        if (magazine == null) {
            return false;
        }
        int rLen = ransomNote.length();
        int mLen = magazine.length();
        if (rLen == 0) {
            return true;
        }
        if (mLen == 0) {
            return false;
        }
        if (rLen > mLen) {
            return false;
        }

        char[] rChars = ransomNote.toCharArray();
        char[] mChars = magazine.toCharArray();

        int[] count = new int[128];

        for (char c : mChars) {
            count[c]++;
        }

        for (char c : rChars) {
            if (count[c] == 0) {
                return false;
            }
            count[c]--;
        }

        return true;
    }
}
