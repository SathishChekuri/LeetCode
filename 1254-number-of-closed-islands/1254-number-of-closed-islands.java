class Solution {
    public int closedIsland(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        for(int i=0;i<n;i++){
            if(i==0||i==n-1){
                for(int j=0;j<m;j++){
                    if(grid[i][j]==0) dfs(i,j,grid);
                }
            }
            else{
                if(grid[i][0]==0) dfs(i,0,grid);
                if(grid[i][m-1]==0) dfs(i,m-1,grid);
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                    ans++;
                    dfs(i,j,grid);
                }
            }
        }
        return ans;
    }
    void dfs(int i,int j,int [][]grid){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]==1) return;
        grid[i][j]=1;
        dfs(i-1,j,grid);
        dfs(i,j+1,grid);
        dfs(i+1,j,grid);
        dfs(i,j-1,grid);
    }
}