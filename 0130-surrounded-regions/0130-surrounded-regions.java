class Solution {
    public void solve(char[][] board) {
        int nr = board.length;
        int nc = board[0].length;
        for (int i = 0; i < nr; i++) {
            dfs(board, i, 0);
            dfs(board, i, nc - 1);
        }
        for (int i = 1; i < nc - 1; i++){
            dfs(board, 0, i);
            dfs(board, nr - 1, i);
        }
        for (int i = 0; i < nr; i++){
            for(int j = 0; j < nc; j++) {
                if (board[i][j] == 'Y') {
                    board[i][j] = 'O';
                } else if (board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }
        return;
    }
    private void dfs(char[][] board, int r, int c) {
        int nr = board.length;
        int nc = board[0].length;
        if (r < 0 || r >= nr || c < 0 || c >= nc || board[r][c] == 'X' || board[r][c] == 'Y') {
            return;
        }
        board[r][c] = 'Y';
        dfs(board, r, c + 1);
        dfs(board, r, c - 1);
        dfs(board, r - 1, c);
        dfs(board, r + 1, c);
    }
}