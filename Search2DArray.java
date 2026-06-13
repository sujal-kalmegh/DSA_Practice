public class Search2DArray {
    public static boolean search(int[][] matrix, int target){
        int n = matrix.length, m = matrix[0].length;
        int low = 0, high = m * n - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int row = mid / m;
            int col = mid % m;
            if(matrix[row][col] == target){
                return true;
            }
            if(matrix[row][col] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        System.out.println(search(matrix, 3));
    }
}
