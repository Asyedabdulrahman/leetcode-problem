class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] Visited = new boolean[n];
        int provinceCount = 0; 

        for(int i = 0; i < n; i++){
            if(!Visited[i]){
                provinceCount++;
                dfs(isConnected, Visited, i);
            }
        }
        return provinceCount;
    }

    private void dfs(int[][] isConnected, boolean[] visited, int currentCity){
        visited[currentCity] = true;

        for(int neighbor = 0; neighbor < isConnected.length; neighbor++){
            if(isConnected[currentCity][neighbor]  == 1 && !visited[neighbor]){
                dfs(isConnected, visited, neighbor);
            }
        }
    }
}