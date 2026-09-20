public class Solution {

    int solveNQueens;

    public int totalNQueens(int n) {

        int[][] board = new int[n][n];

        helper(0, n, board);

        return solveNQueens;
    }

    public void helper(int row, int n, int[][] board) {

        if(row == n){
            solveNQueens++;
            return;
        }

        for(int col = 0; col < n; col++){

            if(board[row][col] == 1){
                continue;
            }

            if(isPossible(row, col, board, n)){
                board[row][col] = 1;

                helper(row + 1, n, board);

                board[row][col] = 0;
            }
        }
    }

    public boolean isPossible(int x, int y, int[][] board, int n){

        // check row & column
        for(int i = 0; i < n; i++){
            if(board[x][i] == 1 || board[i][y] == 1){
                return false;
            }
        }

        // top left diagonal
        int tempx = x, tempy = y;

        while(tempx >= 0 && tempy >= 0){
            if(board[tempx--][tempy--] == 1){
                return false;
            }
        }

        // top right diagonal
        tempx = x;
        tempy = y;

        while(tempx >= 0 && tempy < n){
            if(board[tempx--][tempy++] == 1){
                return false;
            }
        }

        // bottom left diagonal
        tempx = x;
        tempy = y;

        while(tempx < n && tempy >= 0){
            if(board[tempx++][tempy--] == 1){
                return false;
            }
        }

        // bottom right diagonal
        tempx = x;
        tempy = y;

        while(tempx < n && tempy < n){
            if(board[tempx++][tempy++] == 1){
                return false;
            }
        }

        return true;
    }
}
