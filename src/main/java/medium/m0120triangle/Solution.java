package medium.m0120triangle;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()+1][triangle.get(triangle.size()-1).size()+1];

        Arrays.fill(dp[triangle.size()],0);
        for(int i = triangle.size()-1; i >= 0; i--) {
            for(int j = triangle.get(i).size()-1; j>=0; j--) {
                dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i+1][j],dp[i+1][j+1]);
            }
        }
        return dp[0][0];
    }



}
