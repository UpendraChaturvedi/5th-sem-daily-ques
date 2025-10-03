// Last updated: 10/3/2025, 10:30:58 PM
class Solution {
    public boolean exist(char[][] b, String w) {
        int n=b.length;
        int m=b[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(is(b,w,0,i,j)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean is(char [][]b,String w,int k,int i,int j){
        if(k==w.length())return true;
        if(i<0 || j<0 || i>=b.length || j>=b[0].length||w.charAt(k)!=b[i][j]) return false;
        char tmp=b[i][j];   
        b[i][j]='#';
        boolean f=is(b,w,k+1,i+1,j)||is(b,w,k+1,i-1,j)||is(b,w,k+1,i,j+1)||is(b,w,k+1,i,j-1);
        b[i][j]=tmp;
        return f;
    }
}