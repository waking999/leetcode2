package easy.e1025divisorgame;

public class Solution {
    public boolean divisorGame(int N) {


        return dfs(N, 1);
    }

    private boolean dfs(int N, int round) {
        if (N == 1) {
            return round % 2 == 0;
        }
        int x = 1;

        return dfs(N - x, round + 1);


    }

}
