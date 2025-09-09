class Solution {
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int freshes = 0;

        Queue<int[]> q = new ArrayDeque<>();

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 2){
                    q.offer(new int[] {i,j});
                }
                else if (grid[i][j] == 1){
                    ++freshes;
                }
            }
        }
        
        if(freshes == 0) return 0;
        if(q.isEmpty()) return -1;
        
      int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
      
        int minutes = -1;
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                int[] cell = q.poll();
                int x = cell[0];
                int y = cell[1];

                for(int[] dir: directions){
                    int i = x + dir[0];
                    int j = y + dir[1];
                    if(i >= 0 && j >= 0 && i < row && j < col && grid[i][j] == 1){
                        grid[i][j] = 2;
                        --freshes;
                        q.offer(new int[] {i,j});
                    }
                }
            }
            minutes++;
        }
        return freshes == 0 ? minutes : -1;
    }
}