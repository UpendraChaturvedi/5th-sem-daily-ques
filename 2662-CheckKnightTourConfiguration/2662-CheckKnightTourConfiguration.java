// Last updated: 9/4/2025, 11:59:35 AM
class Solution {
    public boolean checkValidGrid(int[][] g) {
        return isval(g,0,0,0);
        
    }
    public static boolean isval(int [][]g,int r,int c,int exp){
        if(r<0 ||c<0 || r>=g.length ||c>=g[0].length || g[r][c]!=exp){
            return false;
        }
        int n=g.length;

        if(exp==n*n-1){
            return true;
        }
        boolean ans1=isval(g,r-2,c+1,exp+1);
        boolean ans2=isval(g,r-1,c+2,exp+1);
        boolean ans3=isval(g,r+1,c+2,exp+1);
        boolean ans4=isval(g,r+2,c+1,exp+1);
        boolean ans5=isval(g,r+2,c-1,exp+1);
        boolean ans6=isval(g,r+1,c-2,exp+1);
        boolean ans7=isval(g,r-1,c-2,exp+1);
        boolean ans8=isval(g,r-2,c-1,exp+1);
        return ans1 || ans2 || ans3 || ans4 || ans5 || ans6 || ans7 || ans8;
    }
    
}