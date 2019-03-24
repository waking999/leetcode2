package easy.e0633sumofsquarenumbers;

public class Solution {
    public boolean judgeSquareSum(int c){
        int r=(int)Math.sqrt(c);

        int l=0;
        while(l<=r){
            int result=l*l+r*r;
            if(result==c){
                return true;
            }else if(result<c){
                l++;
            }else{
                r--;
            }
        }



        return false;
    }

}
