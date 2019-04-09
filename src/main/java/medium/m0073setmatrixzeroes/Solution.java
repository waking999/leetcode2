package medium.m0073setmatrixzeroes;

public class Solution {


    public void setZeroes(int[][] matrix) {
        if (matrix.length == 0) return;
        int n = matrix.length, m = matrix[0].length;
        int[][] temp = new int[n][m];
        for (int i = 0; i < n; i++)
            System.arraycopy(matrix[i], 0, temp[i], 0, m);
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                if (temp[i][j] == 0) {
                    for (int x = 0; x < n; x++) matrix[x][j] = 0;
                    for (int x = 0; x < m; x++) matrix[i][x] = 0;
                }
            }
    }
}
