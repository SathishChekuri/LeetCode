class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int color[]=new int[n];
        Queue<Integer> q=new LinkedList<>();
        for(int j=0;j<n;j++){
        if(color[j]==0){
           if(!dfs(color,j,graph)) return false;
        }
        }
        return true;
        }
        boolean dfs(int [] color,int node ,int[][] graph){
            for(int i:graph[node]){
                if(color[i]==0){
                    if(color[node]==1) color[i]=2;
                    else color[i]=1;
                    if(!dfs(color,i,graph)) return false;
                }
                else if(color[i]==color[node]) return false;
            }
            return true;
    }
}