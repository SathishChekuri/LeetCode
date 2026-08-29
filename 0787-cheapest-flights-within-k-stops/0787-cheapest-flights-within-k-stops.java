class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        PriorityQueue<Pair> pr=new PriorityQueue<>((x,y)->Integer.compare(x.k,y.k));
        ArrayList<ArrayList<Pair>> ar=new ArrayList<>();
        for(int i=0;i<n;i++) ar.add(new ArrayList<>());
        for(int arr[]:flights){
                ar.get(arr[0]).add(new Pair(arr[1],arr[2],0));
        }
        pr.add(new Pair(src,0,0));
        int dist[]=new int[n];
        for(int i=0;i<n;i++){
            dist[i]=(int)1e9;
        }
         dist[src]=0;
        while(!pr.isEmpty()){
            Pair temp=pr.poll();
            int node=temp.node;
            int cost=temp.cost;
           // int num=temp.k;
          // if(node==dst) return cost;
           if(temp.k==k+1) continue;
            for(Pair p:ar.get(node)){
                if(cost+p.cost<dist[p.node]){
                    dist[p.node]=cost+p.cost;
                    pr.add(new Pair(p.node,cost+p.cost,temp.k+1));
                }
            }
        }
        if(dist[dst]==(int)1e9) return -1;
        return dist[dst];
    }
}
class Pair{
    int node;
    int cost;
    int k;
    Pair(int node,int cost,int k){
    this.node=node;
    this.cost=cost;
    this.k=k;
    }
}