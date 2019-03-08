package easy.e0482licensekeyformatting;



public class Solution {
    public String licenseKeyFormatting(String S, int K) {
        int sLen=S.length();

        int charSize=0;
        for(char c:S.toCharArray()){
            if(c!='-'){
                charSize++;
            }
        }
        if(charSize==0){
            return "";
        }
        charSize=charSize+charSize/K+(charSize%K==0?-1:0);
        char[] newChars=new char[charSize];
        int count=0;
        for(int i=sLen-1,j=charSize-1;i>=0;i--){
            char c=S.charAt(i);
            if(c=='-'){
                continue;
            }
            if(c>='a'&&c<='z'){
                c=(char)(c-'a'+'A');
            }
            newChars[j--]=c;
            count++;

            if(j>=0&&count==K){
                newChars[j--]='-';
                count=0;
            }

        }
         return new String(newChars);
    }
}
