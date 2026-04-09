class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] memo = new int[m][n];

        for(int[] row : memo){
            Arrays.fill(row, -1);
        }

        return dfs(grid, 0, 0, memo);
    }

    private int dfs(int[][] grid, int i, int j, int[][] memo) {
        int m = grid.length;
        int n = grid[0].length;

        if (i >= m || j >= n) return Integer.MAX_VALUE / 2;

        if (i == m - 1 && j == n - 1) return grid[i][j];

        if(memo[i][j] != -1) return memo[i][j];

        int down = dfs(grid, i + 1, j, memo);
        int right = dfs(grid, i, j + 1, memo);

        return memo[i][j] = grid[i][j] + Math.min(down, right);
    }
}