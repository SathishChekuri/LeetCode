class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean visited[][]=new boolean[n][m];
        Queue<rotten> q=new LinkedList<>();
        int cnt=0;//freshcount
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new rotten(i,j,0));
                    visited[i][j]=true;
                }
                else if(grid[i][j]==1) cnt++;
            }
        }
        int t=0;
        int dr[]=new int[]{-1,0,+1,0};
        int dc[]=new int[]{0,+1,0,-1};
        while(!q.isEmpty()){
            rotten temp=q.remove();
            int r=temp.r;
            int c=temp.c;
            t=temp.t;
            for(int i=0;i<4;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];
                if(nr>=0&&nr<n&&nc>=0&&nc<m&&!visited[nr][nc]&&grid[nr][nc]==1){
                    visited[nr][nc]=true;
                    q.add(new rotten(nr,nc,t+1));
                    cnt--;
                }
            }
        }
    if(cnt!=0) return -1;
    return t;
    }
}
class rotten{
    int r;
    int c;
    int t;
    rotten(int r,int c,int t){
        this.r=r;
        this.c=c;
        this.t=t;
    }
}