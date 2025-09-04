// Last updated: 9/4/2025, 12:08:22 PM
class Solution {
    public void solveSudoku(char[][] board) {
        sol(board, 0, 0);
    }
    
    public boolean sol(char[][] board, int r, int c) {
        if (r == 9) {
            return true;
        }
        if (c == 9) {
            return sol(board, r + 1, 0);
        }
        if (board[r][c] != '.') {
            return sol(board, r, c + 1);
        }
        
        for (char num = '1'; num <= '9'; num++) {
            if (issafe(board, num, r, c)) {
                board[r][c] = num;
                if (sol(board, r, c + 1)) {
                    return true;
                }
                board[r][c] = '.';
            }
        }
        return false;
    }
    
    public boolean issafe(char[][] board, char num, int r, int c) {
        for (int i = 0; i < 9; i++) {
            if (board[i][c] == num || board[r][i] == num) {
                return false;
            }
        }
        
        int n1 = (r / 3) * 3;
        int n2 = (c / 3) * 3;
        
        for (int k = n1; k < n1 + 3; k++) {
            for (int l = n2; l < n2 + 3; l++) {
                if (board[k][l] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}