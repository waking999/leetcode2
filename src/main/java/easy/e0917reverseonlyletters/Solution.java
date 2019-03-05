package easy.e0917reverseonlyletters;


public class Solution {
    public String reverseOnlyLetters(String S) {
        int sLen=S.length();
        if(sLen==0||sLen==1) return S;

        char[] chars = S.toCharArray();
         int i=0;
         int j=sLen-1;
         while(i<j){
             while(i<sLen&&!isLetter(chars[i])){
                 i++;
             }
             while(j>=0&&!isLetter(chars[j])){
                 j--;
             }
             if(i<sLen&&j>=0&&i<j&&isLetter(chars[i])&&isLetter(chars[j])){
                 char tmp=chars[i];
                 chars[i]=chars[j];
                 chars[j]=tmp;
                 i++;
                 j--;
             }
         }

        return new String(chars);


    }

    private boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
}
