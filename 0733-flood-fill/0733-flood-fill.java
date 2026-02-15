class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int startColor = image[sr][sc];
        if(startColor == color) return image;

        dfs(image,sr,sc, color, startColor);
        return image;
    }

    private void dfs(int[][] image, int row, int col, int color, int startColor){
        int n = image.length;
        int m = image[0].length;

        if(row < 0 || col < 0 || row >= n || col >= m || image[row][col] != startColor){
            return;
        }

        image[row][col] = color;

        dfs(image, row + 1, col, color, startColor);
        dfs(image, row, col + 1, color, startColor);
        dfs(image, row - 1, col, color, startColor);
        dfs(image, row, col - 1, color, startColor);
    }
}