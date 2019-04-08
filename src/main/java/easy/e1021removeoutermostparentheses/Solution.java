package easy.e1021removeoutermostparentheses;

public class Solution {
    public String removeOuterParentheses(String S) {
        int start = 0;
        int open = 0;
        int close = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }
            if (open == close) {
                sb.append(S, start + 1, i);
                start = i + 1;
            }
        }

        return sb.toString();
    }
}
