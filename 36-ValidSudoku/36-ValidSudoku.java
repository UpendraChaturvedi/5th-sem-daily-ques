// Last updated: 9/4/2025, 12:08:23 PM
class Solution {
    public static boolean isvalid(char[][] board,int i,int j,int n){
        for(int k=0;k<9;k++){
            if(board[k][j]==n){
                return false;
            }
        }
        for(int k=0;k<9;k++){
            if(board[i][k]==n){
                return false;
            }
        }
        int sr=i/3*3;
        int sc=j/3*3;
        for(int k=sr;k<sr+3;k++){
            for(int l=sc;l<sc+3;l++){
                if(board[k][l]==n){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if (board[i][j] != '.') { 
                    char n = board[i][j];
                    board[i][j] = '.'; 
                    if (!isvalid(board, i, j, n)) {
                        return false;
                    }
                    board[i][j] = n; 
                }
            }
        }
        return true;
        
    }
}