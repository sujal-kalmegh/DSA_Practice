public class ValidSudoku {
    public static boolean validSudoku(char[][] board){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.' && !isSafe(board, i, j)){
                    return false;
                }
            }
        }
        return true;
    }
    private static boolean isSafe(char[][] board, int row, int col){
        char ch = board[row][col];
        for(int i = 0; i < 9; i++){
            if(ch == board[i][col] && i != row){
                return false;
            }
            if(ch == board[row][i] && i != col){
                return false;
            }
        }
        int startRow = row / 3 * 3;
        int startCol = col / 3 * 3;
        for(int i = startRow; i < startRow + 3; i++){
            for(int j = startCol; j < startCol + 3; j++){
                if(ch == board[i][j] && (i != row || j != col)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(validSudoku(board));
    }
}
