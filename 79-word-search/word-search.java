class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                if(dfs(board, word, row,col,0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int row, int col, int idx){
        if(idx == word.length()){
            return true;
        }

        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != word.charAt(idx)){
            return false;
        }

        char temp = board[row][col];
        board[row][col] = '#';

        // top, bottom , left, right
        Boolean result = dfs(board, word, row - 1,col, idx + 1) || dfs(board, word, row + 1 ,col, idx + 1) || dfs(board, word, row ,col + 1, idx + 1) || dfs(board, word, row ,col - 1, idx + 1);
        board[row][col] = temp;
        return result;
     }
}