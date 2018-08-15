package easy.e0038countandsay.s01;

public class Solution {
    public String countAndSay(int n) {
        String str = "1";
        while (n > 1) {
            n--;
            str = countStr(str);
        }
        return str;
    }

    private String countStr(String str) {
        char[] chars = str.toCharArray();
        int charsLen=chars.length;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < charsLen) {
            int count = 1;
            if (i  < charsLen-1) {
                while (chars[i + 1] == chars[i]) {
                    count++;
                    i++;
                    if (i == charsLen-1) {
                        break;
                    }
                }
            }
            sb.append(count);
            sb.append(chars[i]);
            i++;
        }
        return sb.toString();
    }
}
