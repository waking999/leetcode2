package easy.e1005maximizesumofarrayafterknegations;


import java.util.Arrays;

public class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);

        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (K == 0) {
                sum += A[i];
            } else if (A[i] < 0 && K > 0) {
                sum -= A[i];
                K--;
            } else {
                //A[i}>=0
                if (K % 2 == 0) {
                    sum += A[i];
                    K = 0;
                } else {
                    if (i == 0) {
                        sum -= A[i];
                    } else {
                        /*if the negation of the previous one > the current one (previous one<0), we negatate the current one;
                        else we negatate the previous one, since the previous one (<0) has been negatated before, we have to  deduct the negation of previous one once and negatate it again,
                        so it is 2*A[i-1] and then add the current value
                        */
                        sum += -A[i - 1] > A[i] ? -A[i] : 2 * A[i - 1] + A[i];

                    }
                    K = 0;
                }
            }
        }

        return sum;
    }
}
