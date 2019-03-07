package easy.e367validperfectsquare;

public class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }

        int l=1;
        int r=num;
        while(l+1<r){
            int m=l+(r-l)/2;
            long prd=(long)m*(long)m;
            if(prd==(long)num){
                return true;
            }else if(prd<num){
                l=m;
            }else{
                r=m;
            }
        }

        return false;
    }


}
