class SetMatrixZero{
    public static void setMatrix(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        int x = 1, y = 1;
        for(int i = 0; i < n; i++){
            if(matrix[i][0] == 0){
                x = 0;
                break;
            }
        }
        for(int i = 0; i < m; i++){
            if(matrix[0][i] == 0){
                y = 0;
                break;
            }
        }
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i = 1; i < n; i++){
            if(matrix[i][0] == 0){
                for(int j = 1; j < m; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int i = 1; i < m; i++){
            if(matrix[0][i] == 0){
                for(int j = 1; j < n; j++){
                    matrix[j][i] = 0;
                }
            }
        }
        if(x == 0){
            for(int i = 0; i < n; i++){
                matrix[i][0] = 0;
            }
        }
        if(y == 0){
            for(int i = 0; i < m; i++){
                matrix[0][i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setMatrix(arr);
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}