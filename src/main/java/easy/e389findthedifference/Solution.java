package easy.e389findthedifference;


public class Solution {
    public char findTheDifference(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        int[] count = new int[128];
        for (char c : sChars) {
            count[c]++;
        }

        for (char c : tChars) {
            if (count[c] == 0) {
                return c;
            }
            count[c]--;
        }

        return 0;
    }
}
