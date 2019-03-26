package common.QuadTree;

public class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node() {
    }

    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }

    public static Node construct(int[][] grid){
        if (grid == null) {
            return null;
        }
        int rLen = grid.length;
        if (rLen == 0) {
            return null;
        }
        int cLen = grid[0].length;
        if (cLen == 0) {
            return null;
        }

        return help(0, rLen-1, 0, cLen - 1, grid);
    }

    private static Node help(int r1, int r2, int c1, int c2, int[][] grid) {
        if (r1 > r2 || c1 > c2) {
            return null;
        }
        boolean isLeaf = true;
        int val = grid[r1][c1];
        outter:
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                if (grid[i][j] != val) {
                    isLeaf = false;
                    break outter;
                }
            }
        }
        if (isLeaf) {
            return new Node(val == 1, isLeaf, null, null, null, null);
        }

        int rMid = r1 + (r2 - r1) / 2;
        int cMid = c1 + (c2 - c1) / 2;
        return new Node(false, false,
                help(r1, rMid, c1, cMid, grid),
                help(r1, rMid, cMid + 1, c2, grid),
                help(rMid + 1, r2, c1, cMid, grid),
                help(rMid + 1, r2, cMid + 1, c2, grid));

    }
}
