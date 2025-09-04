// Last updated: 9/4/2025, 12:08:07 PM
class Solution {
    public List<List<String>> solveNQueens(int n) {
        char g[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                g[i][j]='.';
            }
        }
        List<List<String>> results = new ArrayList<>();
        qu(g,0,n,results);
        return results;
        
    }
    public static void qu(char [][]g,int r,int n,List<List<String>> results){
        if(r==g.length){
            results.add(construct(g));
            return ;
        }
        for(int j=0;j<n;j++){
            if(issafe(g,r,j,n)){
                g[r][j]='Q';
                qu(g,r+1,n,results);
                g[r][j]='.';
            }
        }
    }
    public static boolean issafe(char [][]g,int r,int c,int n){
        for(int i=r-1;i>=0;i--){
            if(g[i][c]=='Q'){
                return false;
            }
        }
        for(int i=r-1,j=c-1;i>=0&&j>=0;i--,j--){
            if(g[i][j]=='Q'){
                return false;
            }
        }
        for(int i=r-1,j=c+1;i>=0&&j<n;i--,j++){
            if(g[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    private static List<String> construct(char[][] board) {
    List<String> result = new ArrayList<>();
    
    
    for (char[] row : board) {
       
        result.add(new String(row));
    }
    
    return result;
    }
}