package easy.e0575distributecandies;



public class Solution {
    public int distributeCandies(int[] candies) {

        int l = candies.length>>1;
        boolean[] e=new boolean[200001];
        int r=0;

        for (int c : candies) {
            if(!e[c+100000]){
                r++;
                if(r>=l){
                    return r;
                }
            }
            e[c+100000]=true;
        }

        return r;


    }
}
