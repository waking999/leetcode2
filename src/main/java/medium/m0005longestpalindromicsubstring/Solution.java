package medium.m0005longestpalindromicsubstring;

public class Solution {
    public String longestPalindrome(String s) {
        int sLen = s.length();
        if (sLen <= 1) {
            return s;
        }


        String maxString=s.substring(0,1);
        for(int i=0;i<s.length();i++){
            String tmp=centre(s,i,i);
            if(tmp.length()>maxString.length()){
                maxString=tmp;
            }
            tmp=centre(s,i,i+1);
            if(tmp.length()>maxString.length()){
                maxString=tmp;
            }
        }
        return maxString;

    }

    private String centre(String s, int l, int r){
        while(l>=0&&r<=s.length()-1&&s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }
}
