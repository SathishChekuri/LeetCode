class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        disjoint_set dsj=new disjoint_set(n);
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i!=j&&isConnected[i][j]==1){
                int u=dsj.find(i),v=dsj.find(j);
                if(u==v) continue;
                  dsj.parent[v]=u;
            }
        }
       }
       return dsj.find_p();
    }
}
class disjoint_set{
    int parent[];
    int rank[];
    disjoint_set(int n){
        parent=new int [n];
        rank=new int[n];
        for(int i=0;i<n;i++) parent[i]=i;
    }
    int find(int i){
        if(parent[i]==i) return parent[i];
        parent[i]=find(parent[i]);
        return parent[i];
    }
    int find_p(){
        int c=0;
        for(int i=0;i<parent.length;i++){
            if(parent[i]==i) c++;
        }
        return c;
    }
}