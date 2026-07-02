public class RangeSum {
    int[][] psum;
    public RangeSum(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        psum = matrix;
        for(int i = 1; i < n; i++){
            for(int j = 0; j < m; j++){
                psum[i][j] += psum[i - 1][j];
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 1; j < m; j++){
                psum[i][j] += psum[i][j - 1];
            }
        }
    }
    public int sumRegion(int row1, int col1, int row2, int col2){
        int sum = psum[row2][col2];
        int diff = 0;
        if(row1 != 0 && col1 != 0){
            diff = psum[row1 - 1][col1 - 1];
        }
        if(row1 != 0){
            diff -= psum[row1 - 1][col2];
        }
        if(col1 != 0){
            diff -= psum[row2][col1 - 1];
        }
        return sum + diff;
    }
    public static void main(String[] args) {
        int mat[][] = {{3,0,1,4,2}, {5,6,3,2,1}, {1,2,0,1,5}, {4,1,0,1,7}, {1,0,3,0,5}};
        RangeSum obj = new RangeSum(mat);
        System.out.println(obj.sumRegion(2, 1, 4, 3));
    }
}
