class Solution {
    public int removeStones(int[][] stones) {
        int mxc=0,mxr=0;
        for(int arr[]:stones){
            mxr=Math.max(mxr,arr[0]+1);
            mxc=Math.max(mxc,arr[1]+1);
        }
        
        Dsj dsj=new Dsj(mxr+mxc+1);
        for(int [] arr:stones){
                    int i=arr[0],j=arr[1];
                    int u=dsj.find(i);
                    int v=dsj.find(mxr+j+1);
                    if(u!=v) dsj.unionBySize(u,v);
                }
        HashSet<Integer> hs=new HashSet<>();
        for(int arr[]:stones){
                hs.add(dsj.find(arr[0]));
               //c+=dsj.size[u];
        }
        return stones.length-hs.size();
    }
}
class Dsj{
    int [] parent;
    int [] size;
    Dsj(int n){
        parent=new int[n];
        size=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
            size[i]=1;
        }
    }
    int find(int i){
        if(parent[i]==i) return i;
        return parent[i]=find(parent[i]);
    }
    void unionBySize(int u,int v){
        if(size[u]>size[v]){
            parent[v]=u;
            size[u]+=size[v];
        }
        else{
            parent[u]=v;
            size[v]+=size[u];
        }
    }
}