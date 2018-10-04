package easy.e0896monotonicarray.s01;

public class Solution {
    public boolean isMonotonic(int[] A) {
        if (A == null) {
            return true;
        }
        int aLen = A.length;
        if (aLen <= 2) {
            return true;
        }

        int rule = A[1] - A[0];
        int diff;
        for (int i = 2; i < A.length; i++) {
            diff = A[i] - A[i - 1];
            if (rule == 0) {
                rule = diff;
            } else {
                if ((A[i] != A[i - 1] && (diff > 0 != rule > 0))) {
                    return false;
                }

            }
        }
        return true;


    }

}
