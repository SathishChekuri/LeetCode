class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int color[]=new int[n];
        Queue<Integer> q=new LinkedList<>();
        for(int j=0;j<n;j++){
        if(color[j]==0){
            q.add(j);
           color[j]=1;
        }
        while(!q.isEmpty()){
            int node=q.poll();
            for(int i:graph[node]){
                if(color[i]==0){
                    q.add(i);
                    if(color[node]==1) color[i]=2;
                    else color[i]=1;
                }
                else if(color[i]==color[node]) return false;
            }
        }
        }
        return true;
    }
}