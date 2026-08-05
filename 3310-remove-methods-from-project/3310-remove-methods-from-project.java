class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<Integer> ans=new ArrayList<>();
        List<Integer>[] graph=new ArrayList[n];
        boolean[] visit=new boolean[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        } 
        for(int ar[]:invocations){
            graph[ar[0]].add(ar[1]);
        }
        dfs(graph,visit,k);
        for(int e[]:invocations){
           if(!visit[e[0]]&&visit[e[1]]){
            for(int i=0;i<n;i++){
                ans.add(i);
            }
            return ans;
           }
        }
        for(int i=0;i<n;i++){
            if(!visit[i]) ans.add(i);
        }
        return ans;
    }
    void dfs(List<Integer>[] graph,boolean [] visit,int k){
        visit[k]=true;
        for(int v:graph[k]){
            if(!visit[v]){
                dfs(graph,visit,v);
            }
        }
    }
}