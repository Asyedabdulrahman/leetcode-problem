class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int startColor = image[sr][sc];
        if (startColor == newColor) return image;

        dfs(image, sr, sc, startColor, newColor);
        return image;
    }

    private void dfs(int[][] image, int i, int j, int startColor, int newColor) {
        int rows = image.length;
        int cols = image[0].length;

        if (i < 0 || i >= rows || j < 0 || j >= cols || image[i][j] != startColor) {
            return;
        }

        image[i][j] = newColor;

        dfs(image, i + 1, j, startColor, newColor);
        dfs(image, i - 1, j, startColor, newColor);
        dfs(image, i, j + 1, startColor, newColor);
        dfs(image, i, j - 1, startColor, newColor);
    }
}