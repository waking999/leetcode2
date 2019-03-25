package easy.e1020partitionarrayintothreepartswithequalsum;

public class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int aLen = A.length;

        int[] lToRSum = new int[aLen];
        lToRSum[0] = A[0];
        //lToRSum: sum from left to right
        for (int i = 1; i < aLen; i++) {
            lToRSum[i] = lToRSum[i - 1] + A[i];
        }

        int targetSum = lToRSum[aLen - 1] / 3;

        int left = 0;
        int right = aLen - 1;

        //find the left position whose value is target sum;
        while (left <= aLen - 3 && lToRSum[left] != targetSum) {
            left++;
        }
        //if only the last 2 positions are possible to equal to target sum, it means no such partition;
        if (left >= aLen - 2) {
            return false;
        }

        //find the right position whose value is 2 * target sum
        while (right >= left + 2 && lToRSum[right] != 2 * targetSum) {
            right--;
        }
        if (lToRSum[right] != 2 * targetSum) {
            return false;
        } else return lToRSum[right] == 2 * targetSum;
    }


}
