class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        boolean []visited=new boolean[graph.length];
        boolean path[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visited[i]) dfs(i,path,visited,graph);
        }
        List<Integer> ar=new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            if(!path[i]) ar.add(i);
        }
        return ar;
    }
    boolean dfs(int node,boolean path[],boolean visited[],int [][] graph){
        visited[node]=true;
         path[node]=true;
         for(int i:graph[node]){
            if(!visited[i]){
                if(dfs(i,path,visited,graph)) return true;
            }
            else if(path[i]){
                return true;
            }
         }
         path[node]=false;
         return false;
    }
}