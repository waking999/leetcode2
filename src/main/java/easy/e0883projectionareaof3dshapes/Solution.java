package easy.e0883projectionareaof3dshapes;

public class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;


        int leftRightArea = 0;
        int frontBackArea = 0;
        int bottomArea=0;


        for (int i = 0; i < n; i++) {
            int maxLeftRight=grid[0][i];
            int maxFrontBack=grid[i][0];
            for(int j=0;j<n;j++){
                if(maxLeftRight<grid[j][i]){
                    maxLeftRight=grid[j][i];
                }
                if(maxFrontBack<grid[i][j]){
                    maxFrontBack=grid[i][j];
                }
                if(grid[i][j]!=0){
                    bottomArea++;
                }

            }

            leftRightArea += maxLeftRight;
            frontBackArea +=maxFrontBack;
        }


        return bottomArea + leftRightArea + frontBackArea;
    }
}
