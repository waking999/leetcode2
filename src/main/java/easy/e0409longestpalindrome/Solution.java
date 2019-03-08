package easy.e0409longestpalindrome;

public class Solution {
    public int longestPalindrome(String s) {

        char[] chars=s.toCharArray();
        int[] count=new int[52];

        for(char c:chars){
            if(c>='a'&&c<='z'){
                count[c-'a']++;
            }else{
                count[c-'A'+26]++;
            }
        }
        int ans=0;
        for(int i=0;i<52;i++){
            ans+=count[i]/2*2;
            if(count[i]%2==1&&ans%2==0){
                ans++;
            }
        }


        return ans;
    }
}
