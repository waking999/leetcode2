package easy.e0976largestperimetertriangle;

import java.util.Arrays;

public class Solution {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);

        int aLen=A.length;
        for(int i=aLen-1;i>=2;i--){
            int a=A[i-2]+A[i-1];
            if(a>A[i]){
                return a+A[i];
            }
        }

        return 0;
    }
}
