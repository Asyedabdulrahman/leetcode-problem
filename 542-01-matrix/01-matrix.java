class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        // initialize the mat of result -1
        int[][] distances = new int[rows][cols];
        for (int[] row : distances) {
            Arrays.fill(row, -1);
        }

        // initialize queue
        Deque<int[]> queue = new ArrayDeque<>();

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (mat[row][col] == 0) {
                    queue.offer(new int[] { row, col });
                    distances[row][col] = 0;
                }
            }
        }

        // direction vertor to move up , odnw, left, right
        int[] direction = { -1, 0, 1, 0, -1 };
        while (!queue.isEmpty()) {

            int[] currentCell = queue.poll();
            int currentRow = currentCell[0];
            int currentCol = currentCell[1];

            for (int dir = 0; dir < 4; dir++) {
                int nextRow = currentRow + direction[dir];
                int nextCol = currentCol + direction[dir + 1];

                if (nextRow >= 0 && nextRow < rows && nextCol >= 0 && nextCol < cols
                        && distances[nextRow][nextCol] == -1) {

                    distances[nextRow][nextCol] = distances[currentRow][currentCol] + 1;

                    queue.offer(new int[] { nextRow, nextCol });
                }
            }
        }
        return distances;
    }
}