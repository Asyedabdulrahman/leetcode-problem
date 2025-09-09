class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        Queue<int[]> q = new ArrayDeque<>();
        int fresh = 0;

        // collect initial rotten oranges and count fresh
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) q.offer(new int[]{i, j, 0});
                else if (grid[i][j] == 1) fresh++;
            }
        }

        if (fresh == 0) return 0;        // no fresh oranges
        if (q.isEmpty()) return -1;      // no rotten to spread

        int minutes = 0;
        int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1], time = cur[2];
            minutes = time; // track the last minute we reached

            for (int[] d : dirs) {
                int nx = x + d[0], ny = y + d[1];
                if (nx < 0 || ny < 0 || nx >= m || ny >= n) continue;
                if (grid[nx][ny] != 1) continue;

                grid[nx][ny] = 2;
                fresh--;
                q.offer(new int[]{nx, ny, time + 1});
            }
        }

        return fresh == 0 ? minutes : -1;
    }
}