package easy.e0009palindromenumber.s01;

public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x<10){
            return true;
        }
        int tmp=x;
        int y=0;
        while(x!=0){
            y=y*10+x%10;
            x=x/10;
        }
        return (y==tmp);
    }
}