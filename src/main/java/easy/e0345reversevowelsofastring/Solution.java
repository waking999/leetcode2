package easy.e0345reversevowelsofastring;

public class Solution {
    public String reverseVowels(String s) {

        int sLen=s.length();
        if(sLen==0||sLen==1) return s;
        char[] chars = s.toCharArray();
        int i=0;
        int j=sLen-1;

        while(i<j){
            while(i<sLen&&!isVowel(chars[i])){
                i++;
            }
            while(j>=0&&!isVowel(chars[j])){
                j--;
            }
            if(i<sLen&&j>=0&&i<j&&isVowel(chars[i])&&isVowel(chars[j])){
                char tmp=chars[i];
                chars[i]=chars[j];
                chars[j]=tmp;
                i++;
                j--;
            }
        }


        return new String(chars);
    }

    private boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
}
