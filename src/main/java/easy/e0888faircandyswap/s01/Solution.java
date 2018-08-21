package easy.e0888faircandyswap.s01;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {

        int aSum=0;
        int bSum=0;
        Set<Integer> bSet=new HashSet<>();

        for(int i:A){
            aSum+=i;
        }

        for(int i:B){
            bSum+=i;
            bSet.add(i);
        }
        int max=Math.max(aSum,bSum);
        boolean isALarger=aSum==max;
        int average=aSum+(bSum-aSum)/2;
        int gap=max-average;
        for(int x:A){

            int y=gap+x;
            if(isALarger){
                y=x-gap;
            }
            if(bSet.contains(y)){
                int[] rtn=new int[2];
                rtn[0]=x;
                rtn[1]=y;
                return rtn;
            }
        }


        return null;
    }
}
