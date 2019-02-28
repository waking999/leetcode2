package easy.e0977squaresofasortedarray;

import java.util.Arrays;

public class Solution {
    public int[] sortedSquares(int[] A) {

        int aLen=A.length;
        for(int i=0;i<aLen;i++){
            A[i]=A[i]*A[i];
        }

        Arrays.sort(A);

        return A;
    }
}
