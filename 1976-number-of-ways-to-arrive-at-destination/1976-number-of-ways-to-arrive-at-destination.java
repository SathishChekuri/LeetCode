class Solution {
    int MOD=1000_000_007;
    public int countPaths(int n, int[][] roads) {
        int []paths=new int[n];
        long dist[]=new long[n];
        ArrayList<ArrayList<Pair>> ar=new ArrayList<>();
        for(int i=0;i<n;i++){
            ar.add(new ArrayList<>());
            dist[i]=Long.MAX_VALUE;
        }
        dist[0]=0;
        paths[0]=1;
        for(int arr[]:roads){
            ar.get(arr[0]).add(new Pair(arr[1],arr[2]));
            ar.get(arr[1]).add(new Pair(arr[0],arr[2]));
        }
        PriorityQueue<Pair> pr=new PriorityQueue<>((x,y)->Long.compare(x.wt,y.wt));
        pr.add(new Pair(0,0));
        while(!pr.isEmpty()){
            Pair temp=pr.poll();
            int node=temp.node;
            long wt=temp.wt;
            if(node==n-1) return paths[node];
            for(Pair p:ar.get(node)){
                if(dist[p.node]>wt+p.wt){
                    pr.add(new Pair(p.node,(long)wt+p.wt));
                    paths[p.node]=paths[node];
                    dist[p.node]=wt+p.wt;
                }
                else if(dist[p.node]==wt+p.wt){
                    paths[p.node]=(int)((long)paths[p.node]+paths[node])%MOD;
                }
            }
        }
        return paths[n-1];
    }
}
class Pair{
    int node;
    long wt;
    Pair(int node,long wt){
        this.node=node;
        this.wt=wt;
    }
}