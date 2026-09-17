class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        // Fill board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        solve(0, n, board, result);
        return result;
    }
    static void solve(int row, int n,
                      char[][] board,
                      List<List<String>> result) {
        // Base case
        if (row == n) {
            List<String> solution = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                solution.add(new String(board[i]));
            }
            result.add(solution);
            return;
        }
        // Try every column
        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, n, board)) {
                // TAKE
                board[row][col] = 'Q';
                // RECURSE
                solve(row + 1, n, board, result);
                // UNDO
                board[row][col] = '.';
            }
        }
    }
    static boolean isSafe(int row, int col,
                          int n, char[][] board) {
        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }
        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < n;
             i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }
        return true;
    }
}
