class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int mn=Integer.MAX_VALUE,city=-1;
        ArrayList<ArrayList<Pair>> ar=new ArrayList<>();
        for(int i=0;i<n;i++) ar.add(new ArrayList<>());
        for(int arr[]:edges){
            ar.get(arr[0]).add(new Pair(arr[1],arr[2]));
            ar.get(arr[1]).add(new Pair(arr[0],arr[2]));
        }
        for(int i=n-1;i>=0;i--){
            int c=dijkstra(i,ar,distanceThreshold);
            if(c<mn){
                city=i;
                mn=c;
            }
        }
        return city;
    }
    int dijkstra(int curr,ArrayList<ArrayList<Pair>> ar,int d){
        int dist[]=new int[ar.size()];
        for(int i=0;i<dist.length;i++) dist[i]=Integer.MAX_VALUE;
        PriorityQueue<Pair> pr=new PriorityQueue<>((x,y)->Integer.compare(x.wt,y.wt));
        dist[curr]=0;
        pr.add(new Pair(curr,0));
        while(!pr.isEmpty()){
            Pair temp=pr.poll();
            int node=temp.node;
            int wt=temp.wt;
            if(wt>d) break;
            for(Pair p:ar.get(node)){
                if(dist[p.node]>wt+p.wt){
                    dist[p.node]=wt+p.wt;
                    pr.add(new Pair(p.node,wt+p.wt));
                }
            }
        }
        int c=0;
        for(int i:dist){
            if(i<=d) c++;
        }
        return c;
    }
}
class Pair{
    int node;
    int wt;
    Pair(int node,int wt){
        this.node=node;
        this.wt=wt;
    }
}