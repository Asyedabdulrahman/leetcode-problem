class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinceCount = 0; 

        for(int i = 0; i < n; i++){
            if(!visited[i]){
                provinceCount++;
                dfs(isConnected,visited, i);
            }
        }
        return provinceCount;
    }

    private void dfs(int[][] connected,boolean[] visited, int currentCity){
        visited[currentCity] = false;

        for(int neighbor = 0; neighbor < connected.length; neighbor++){
            if(connected[neighbor][currentCity] == 1 && !visited[neighbor]){
                dfs(connected, visited, neighbor);
            }
        }
    }
}