public class MatrixBlockSum {
    public static int[][] matrixBlockSum(int[][] mat, int k){
        int m = mat.length,  n = mat[0].length;
        int[][] sum = new int[m + 1][n + 1];
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                sum[i][j] = mat[i - 1][j - 1] + sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1];
            }
        }
        // for(int i = 0; i < sum.length; i++){
        //     for(int j = 0; j < sum[0].length; j++){
        //         System.out.print(sum[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        int[][] ans = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int r1 = Math.max(0, i - k), c1 = Math.max(0, j - k);
                int r2 = Math.min(m - 1, i + k), c2 = Math.min(n - 1, j + k);
                r1++;
                r2++;
                c1++;
                c2++;
                ans[i][j] = sum[r2][c2] - sum[r2][c1 - 1] - sum[r1 - 1][c2] + sum[r1 - 1][c1 - 1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] ans = matrixBlockSum(mat, 1);
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[0].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
