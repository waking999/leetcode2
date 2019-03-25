package medium.m0779kthsymbolingrammar;

public class Solution {


    public int kthGrammar(int N, int K) {
        if (N == 1 && K == 1) {
            return 0;
        }
        if (N == 2) {
            return K - 1;
        }

        //track the branch from leaf to root
        //an array to show if target node is the left child of parent
        boolean[] isLeft = new boolean[N + 1];

        int currLine = N;
        K = K - 1;
        while (currLine >= 2) {
            isLeft[currLine] = K % 2 == 0;
            K = K / 2;
            currLine--;
        }


        int currVal = 0;
        if (!isLeft[2]) {
            currVal = 1;
        }

        //calculate node value from root to leaf by the branch track
        for (int i = 3; i <= N; i++) {
            currVal = getChildValue(currVal, isLeft[i]);
        }
        return currVal;
    }


    private int getChildValue(int parent, boolean isLeft) {
        /*
           0
          /  \
          0  1

           1
          / \
          1  0
         */
        if ((parent == 0 && isLeft) || (parent == 1 && !isLeft)) {
            return 0;
        }

        return 1;
    }


}
