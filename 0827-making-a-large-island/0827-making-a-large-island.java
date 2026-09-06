class Solution {
    public int largestIsland(int[][] grid) {
        int n=grid.length;
        Dsj dsj=new Dsj(n*n+1);
        int dc[]=new int[]{0,1,0,-1};
        int [] dr=new int[]{-1,0,1,0};
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    for(int k=0;k<4;k++){
                        int nr=i+dr[k];
                        int nc=j+dc[k];
                        if(nr>=0&&nc>=0&&nr<n&&nc<n&&grid[nr][nc]==1){
                            int u=dsj.find(n*nr+nc);
                            int v=dsj.find(n*i+j);
                            if(u==v) continue;
                            dsj.unionBySize(u,v);
                        }
                    }
                }
            }
        }
        int mx=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1) continue;
                HashSet<Integer> hs=new HashSet<>();
                for(int k=0;k<4;k++){
                     int nr=i+dr[k];
                     int nc=j+dc[k];
                        if(nr>=0&&nc>=0&&nr<n&&nc<n&&grid[nr][nc]==1){
                            int u=dsj.find(n*nr+nc);
                            hs.add(u);
                        }
                }
                int sum=1;
                for(int k:hs) sum+=dsj.size[k];
                mx=Math.max(mx,sum);
            }
        }
        for(int i=1;i<=n*n;i++) mx=Math.max(dsj.size[dsj.find(i)],mx);
        return mx;     
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
        else {
            parent[u]=v;
            size[v]+=size[u];
        }
    }
}