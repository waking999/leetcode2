package easy.e0949largesttimeforgivendigits;

import java.util.Arrays;

public class Solution {
    public String largestTimeFromDigits(int[] A) {

        min = "00:00";
        max = "23:59";
        maxAvaiable = "";

        Arrays.sort(A);


        permute(A, 0, 3);

        return maxAvaiable;


    }

    String min = null;
    String max = null;
    String maxAvaiable = null;

    private void permute(int[] A, int l, int r) {

        if (l == r) {
            if (A[0] >= 3) {
                return;
            }
            if (A[0] == 2 && A[1] >= 4) {
                return;
            }
            if(A[2]>=6){
                return;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(A[0]).append(A[1]).append(":").append(A[2]).append(A[3]);
            String tmp = sb.toString();
            if (tmp.compareTo(min) >= 0 && tmp.compareTo(max) <= 0) {
                if ("".equals(maxAvaiable)) {
                    maxAvaiable = "00:00";
                }
                if (tmp.compareTo(maxAvaiable) > 0) {
                    maxAvaiable = tmp;
                }
            }
        } else {
            for (int i = l; i <= r; i++) {
                A = swap(A, l, i);
                permute(A, l + 1, r);
                A = swap(A, l, i);
            }
        }
    }

    private int[] swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
        return A;
    }
}
