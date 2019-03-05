package easy.e0994rottingoranges;

import java.util.*;

public class Solution {
    public int orangesRotting(int[][] grid) {
        int rowLen = grid.length;
        int colLen = grid[0].length;
        int zeroCount = 0;
        int oneCount = 0;

        Set<Position> rottingStarts = new HashSet<>();

        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {


                if (grid[i][j] == 2) {
                    rottingStarts.add(new Position(i, j));

                } else if (grid[i][j] == 0) {
                    zeroCount++;
                } else {
                    oneCount++;
                }
            }
        }
        int twoCount = rottingStarts.size();
        if (zeroCount > 0 && oneCount == 0 && twoCount == 0) {
            //only empty cell
            return 0;
        }
        if (zeroCount == 0 && oneCount > 0 && twoCount == 0) {
            //all good
            return -1;
        }

        if (zeroCount > 0 && oneCount > 0 && twoCount == 0) {
            //no bad, part good, part empty
            return -1;
        }


        int round = 0;
        while (!rottingStarts.isEmpty()) {
            if (rottingStarts.size() > 0) {
                round++;
                Iterator<Position> it = rottingStarts.iterator();
                Set<Position> nexRoundStarts = new HashSet<>();
                while (it.hasNext()) {
                    Position start = it.next();
                    int i = start.i;
                    int j = start.j;
                    rotting(grid, rowLen, colLen, i, j, nexRoundStarts);
                }
                rottingStarts.clear();
                rottingStarts.addAll(nexRoundStarts);
            }

        }

        //if exist isolated cell after rotting
        for (int[] ints : grid) {
            for (int j = 0; j < colLen; j++) {
                if (ints[j] == 1) {
                    return -1;
                }
            }
        }

        return round - 1;
    }

    private void rottingEach(int[][] grid, int i, int j, Set<Position> nextRoundStarts) {
        if (grid[i][j] == 1) {
            grid[i][j] = 2;
            nextRoundStarts.add(new Position(i, j));
        }
    }

    private void rotting(int[][] grid, int rowLen, int colLen, int i, int j, Set<Position> nextRoundStarts) {
        if (i == 0 && j == 0) {
            //top,left
            if (i < rowLen - 1) {
                rottingEach(grid, i + 1, j, nextRoundStarts);
            }

            if (j < colLen - 1) {
                rottingEach(grid, i, j + 1, nextRoundStarts);
            }
            return;
        }
        if (i == rowLen - 1 && j == 0) {
            //bottom, left
            if (i > 0) {
                rottingEach(grid, i - 1, j, nextRoundStarts);
            }

            if (j < colLen - 1) {
                rottingEach(grid, i, j + 1, nextRoundStarts);
            }
            return;
        }
        if (i == 0 && j == colLen - 1) {
            //top,right
            if (i < rowLen - 1) {
                rottingEach(grid, i + 1, j, nextRoundStarts);
            }

            if (j > 0) {
                rottingEach(grid, i, j - 1, nextRoundStarts);
            }
            return;
        }
        if (i == rowLen - 1 && j == colLen - 1) {
            //bottom,right
            if (i > 0) {
                rottingEach(grid, i - 1, j, nextRoundStarts);
            }

            if (j > 0) {
                rottingEach(grid, i, j - 1, nextRoundStarts);
            }
            return;
        }
        if (i == 0) {
            //top
            if (j > 0) {
                rottingEach(grid, i, j - 1, nextRoundStarts);
            }

            if (j < colLen - 1) {
                rottingEach(grid, i, j + 1, nextRoundStarts);
            }

            if (i < rowLen - 1) {
                rottingEach(grid, i + 1, j, nextRoundStarts);
            }
            return;

        }
        if (i == rowLen - 1) {
            //bottom
            if (j > 0) {
                rottingEach(grid, i, j - 1, nextRoundStarts);
            }

            if (j < colLen - 1) {
                rottingEach(grid, i, j + 1, nextRoundStarts);
            }


            if (i > 0) {
                rottingEach(grid, i - 1, j, nextRoundStarts);
            }

            return;
        }
        if (j == 0) {
            //left
            if (i > 0) {
                rottingEach(grid, i - 1, j, nextRoundStarts);
            }


            if (i < rowLen - 1) {
                rottingEach(grid, i + 1, j, nextRoundStarts);
            }


            if (j < colLen - 1) {
                rottingEach(grid, i, j + 1, nextRoundStarts);
            }

            return;
        }
        if (j == colLen - 1) {
            //right
            if (i > 0) {
                rottingEach(grid, i - 1, j, nextRoundStarts);
            }

            if (i < rowLen - 1) {
                rottingEach(grid, i + 1, j, nextRoundStarts);
            }

            if (j > 0) {
                rottingEach(grid, i, j - 1, nextRoundStarts);
            }

            return;
        }

        if (i > 0) {
            rottingEach(grid, i - 1, j, nextRoundStarts);
        }

        if (i < rowLen - 1) {
            rottingEach(grid, i + 1, j, nextRoundStarts);
        }

        if (j > 0) {
            rottingEach(grid, i, j - 1, nextRoundStarts);
        }


        if (j < colLen - 1) {
            rottingEach(grid, i, j + 1, nextRoundStarts);
        }

    }


    class Position {
        int i;
        int j;

        Position(int i, int j) {
            this.i = i;
            this.j = j;
        }

        @Override
        public boolean equals(Object other) {

            if (other == null) {
                return false;
            }
            if (!(other instanceof Position)) {
                return false;
            }
            return this.i == ((Position) other).i && this.j == ((Position) other).j;
        }

        @Override
        public int hashCode() {
            return Integer.hashCode(i) * 32 + Integer.hashCode(j);
        }

    }
}
