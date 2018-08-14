package easy.e0020validparentheses.s01;

public class Solution {
    public boolean isValid(String s) {
        if (s == null) {
            return true;
        }
        if (s.isEmpty()) {
            return true;
        }
        int sSize = s.length();
        char[] chars = s.toCharArray();

        char[] cStack=new char[sSize];
        int cStackLen=0;
        cStack[0]=chars[0];
        cStackLen++;

        int i = 1;
        while (i < sSize) {
            if (chars[i] == '(' || chars[i] == '[' || chars[i] == '{') {

                cStack[cStackLen++]=chars[i];
                i++;
            } else {
                if(cStackLen==0){
                    return false;
                }
                char cTop = cStack[cStackLen-1];
                if ((cTop == '(' && chars[i] == ')') || (cTop == '[' && chars[i] == ']')
                        || (cTop == '{' && chars[i] == '}')) {
                    cStackLen--;
                    i++;
                } else {
                    return false;
                }
            }
        }
        return cStackLen == 0;
    }
}
