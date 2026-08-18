class Solution {
    public int numIslands(char[][] grid) {
        boolean visited[][]=new boolean[grid.length][grid[0].length];
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'&&!visited[i][j]){
                    c++;
                    bfs(grid,visited,i,j);
                }
            }
        }
        return c;
    }
    void bfs(char [][]grid,boolean[][] visited,int r,int c){
        Queue<int[]> q=new LinkedList<>();
         visited[r][c]=true;
        q.add(new int[]{r,c});
        while(!q.isEmpty()){
            int arr[]=q.remove();
            r=arr[0];
            c=arr[1];
            for(int i=-1;i<=1;i++){
                for(int j=-1;j<=1;j++){
                    if(i==j||i+j==0) continue;
                    int nr=r+i;
                    int nc=c+j;
                    if(nr<grid.length&&nr>=0&&nc>=0&&nc<grid[0].length&&grid[nr][nc]=='1'&&!visited[nr][nc]){
                        q.add(new int[]{nr,nc});
                         visited[nr][nc]=true;
                    }
                }
            }
        }
    }
}