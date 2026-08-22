class Solution {
    public int longestCycle(int[] edges) {
        int mx=-1;
        int n=edges.length;
        boolean visited[]=new boolean[n];
        int path[]=new int[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                mx=Math.max(mx,dfs(i,1,edges,visited,path));
            }
        }
        return mx;
    }
    int dfs(int node,int c,int [] edges,boolean [] visited,int []path){
        int neighbour=edges[node];
        visited[node]=true;
         path[node]=c;
        if(neighbour==-1){
            path[node]=0;
            return -1;
        }
        if(!visited[neighbour]){
             int res=dfs(neighbour,c+1,edges,visited,path);
              path[node]=0;;
              return res;
        }
        else if(path[neighbour]!=0){
             path[node]=0;
            return c-path[neighbour]+1;
        }
        path[node]=0;
        return -1;
    }
}