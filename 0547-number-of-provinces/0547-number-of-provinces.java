class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean [] visited=new boolean[isConnected.length];
     int c=0;
     for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                c++;
                dfs(i,visited,isConnected);
            }
        }
        return c;
    }
    void dfs(int node,boolean[] visited,int [][]graf){
        visited[node]=true;
        for(int i=0;i<visited.length;i++){
            if(!visited[i]&&graf[node][i]==1) dfs(i,visited,graf);
        }
    }
}