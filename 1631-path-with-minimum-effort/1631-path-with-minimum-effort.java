class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n=heights.length,m=heights[0].length;
        int dist[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) dist[i][j]=Integer.MAX_VALUE;
        }
        dist[0][0]=0;
        PriorityQueue<Pair> pr=new PriorityQueue<>((x,y)->Integer.compare(x.mxd,y.mxd));
        pr.add(new Pair(0,0,0));
        int [] dr=new int[]{-1,0,1,0};
        int [] dc=new int[]{0,1,0,-1};
        while(!pr.isEmpty()){
            Pair t=pr.poll();
            int r=t.r;
            int c=t.c;
            int mxd=t.mxd;
            if(r==n-1&&c==m-1) return mxd;
            for(int i=0;i<4;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];
                if(nr>=0&&nc>=0&&nr<n&&nc<m){
                    int d=Math.abs(heights[nr][nc]-heights[r][c]);
                    int max_diff=Integer.max(mxd,d);
                    if(dist[nr][nc]>max_diff){
                        dist[nr][nc]=max_diff;
                        pr.add(new Pair(nr,nc,dist[nr][nc]));
                    }
                }
            }
        }
        return -1;
    }
}
class Pair{
    int r,c,mxd;
    Pair(int r,int c,int mxd){
        this.r=r;
        this.c=c;
        this.mxd=mxd;
    }
}