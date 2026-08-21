class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        int c=0;
        boolean visited[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
           if(!visited[i][0]&&grid[i][0]==1){
            dfs(i,0,visited,grid);
           }
           if(!visited[i][m-1]&&grid[i][m-1]==1){
            dfs(i,m-1,visited,grid);
           }
        }
        for(int i=0;i<m;i++){
           if(!visited[0][i]&&grid[0][i]==1){
            dfs(0,i,visited,grid);
           }
           if(!visited[n-1][i]&&grid[n-1][i]==1){
            dfs(n-1,i,visited,grid);
           }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j]&&grid[i][j]==1) c++;
            }
        }
        return c;
    }
    void dfs(int r,int c,boolean [][] visited,int [][] grid){
        int [] dc=new int[]{0,1,0,-1};
        int dr[]=new int[]{-1,0,1,0};
        int n=grid.length;
        int m=grid[0].length;
        visited[r][c]=true;
        for(int i=0;i<4;i++){
            int nr=r+dr[i];
            int nc=c+dc[i];
            if(nr>=0&&nr<n&&nc>=0&&nc<m&&grid[nr][nc]==1&&!visited[nr][nc]){
                dfs(nr,nc,visited,grid);
            } 
        }
    }
}