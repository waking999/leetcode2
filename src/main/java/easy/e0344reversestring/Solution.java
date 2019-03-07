package easy.e0344reversestring;

public class Solution {
    public void reverseString(char[] s) {
        int sLen=s.length;
        int half=sLen/2;
        for(int i=0;i<half;i++){
            char tmp=s[i];
            int j=sLen-1-i;
            s[i]=s[j];
            s[j]=tmp;
        }
    }
}
