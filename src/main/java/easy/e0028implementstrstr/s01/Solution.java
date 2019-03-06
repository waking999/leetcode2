package easy.e0028implementstrstr.s01;

public class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack == null) {
            return -1;
        }
        if (needle == null) {
            return 0;
        }
        int h = haystack.length();
        int n = needle.length();

        if(n==0){
            return 0;
        }

        if((h == 0 || h < n)){
            return -1;
        }

        int p=0;
        while(p<h){
            if(p+n>h){
                return -1;
            }
            if(p<h&&haystack.charAt(p)!=needle.charAt(0)){
                p++;
                continue;
            }
            if(haystack.substring(p,p+n).equals(needle)){
                return p;
            }else{
                p++;
            }
        }

        return -1;
    }
}
