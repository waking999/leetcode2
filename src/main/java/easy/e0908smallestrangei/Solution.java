package easy.e0908smallestrangei;

public class Solution {
    public int smallestRangeI(int[] A, int K) {
        int max = A[0];
        int min = A[0];
        int aLen = A.length;

        for (int i = 1; i < aLen; i++) {
            if (A[i] > max) {
                max = A[i];
            }
            if (A[i] < min) {
                min = A[i];
            }
        }

        int diff= max - min - 2 * K;
        return Math.max(diff,0);
    }
}
