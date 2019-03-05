package easy.e0944deletecolumnstomakesorted;



public class Solution {
    public int minDeletionSize(String[] A) {
        int aLen = A.length;
        int count = 0;
        int sLen = A[0].length();
        for (int i = 0; i < sLen; i++) {
            char pre = A[0].charAt(i);
            for (int j = 1; j < aLen; j++) {
                String a1 = A[j];
                char c1 = a1.charAt(i);

                if (c1 < pre) {
                    count++;
                    break;
                } else {
                    pre = c1;
                }

            }
        }

        return count;
    }
}
