package easy.e0999availablecapturesforrook;

public class Solution {
    public int numRookCaptures(char[][] board) {
        int ri = -1;
        int rj = -1;

        outerloop:
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    ri = i;
                    rj = j;
                    break outerloop;
                }
            }
        }
        if (ri == -1) {
            return 0;
        }

        int count=0;
        //up
        for(int i=ri-1;i>=0;i--){
            if(board[i][rj]=='.'){
                continue;
            }
            if(board[i][rj]=='B'){
                break;
            }
            if(board[i][rj]=='p'){
                count++;
                break;
            }
        }

        //down
        for(int i=ri+1;i<8;i++){
            if(board[i][rj]=='.'){
                continue;
            }
            if(board[i][rj]=='B'){
                break;
            }
            if(board[i][rj]=='p'){
                count++;
                break;
            }
        }

        //left
        for(int j=rj-1;j>=0;j--){
            if(board[ri][j]=='.'){
                continue;
            }
            if(board[ri][j]=='B'){
                break;
            }
            if(board[ri][j]=='p'){
                count++;
                break;
            }
        }

        //right
        for(int j=rj+1;j<8;j++){
            if(board[ri][j]=='.'){
                continue;
            }
            if(board[ri][j]=='B'){
                break;
            }
            if(board[ri][j]=='p'){
                count++;
                break;
            }
        }

        return count;
    }
}
