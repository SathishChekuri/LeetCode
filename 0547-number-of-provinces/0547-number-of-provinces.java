class Solution {
    public int findCircleNum(int[][] isConnected) {
       int c=0;
        boolean visited[]=new boolean[isConnected.length+1];
        for(int i=1;i<visited.length;i++){
            if(!visited[i-1]){
                c++;
                bfs(i,isConnected,visited);
            }
        }
        return c;
    }
    void bfs(int node,int [][] isConnected,boolean[] visited){
         Queue<Integer> q=new LinkedList<>();
        q.offer(node);
        while(!q.isEmpty()){
            node=q.poll();
            visited[node-1]=true;
            for(int i=1;i<=isConnected.length;i++){
                if(isConnected[node-1][i-1]==1&&!visited[i-1]){
                    visited[i-1]=true;
                    q.offer(i);
                }
            }
        }
    }
}