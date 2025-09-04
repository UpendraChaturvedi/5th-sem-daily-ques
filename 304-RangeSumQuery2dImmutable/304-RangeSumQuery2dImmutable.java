// Last updated: 9/4/2025, 12:05:44 PM
class NumMatrix {
    static int arr[][];
    public NumMatrix(int[][] matrix) {
        
        arr=matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int s=0;
        for(int i=row1;i<=row2;i++){
            for(int j=col1;j<=col2;j++){
                s+=arr[i][j];
            }
        }
        return s;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */