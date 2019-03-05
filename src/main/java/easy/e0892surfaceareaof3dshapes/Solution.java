package easy.e0892surfaceareaof3dshapes;

public class Solution {
    public int surfaceArea(int[][] grid) {
        int area = 0;

        int n = grid.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j]>0) area += 4 * grid[i][j] + 2;
                if (i > 0) area -= Math.min(grid[i][j], grid[i - 1][j]) * 2;
                if (j > 0) area -= Math.min(grid[i][j], grid[i][j - 1]) * 2;
            }
        }

        return area;
    }
}
