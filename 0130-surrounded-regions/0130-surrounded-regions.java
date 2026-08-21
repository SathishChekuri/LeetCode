class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        boolean [][]visited=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='X') visited[i][j]=true;
                board[i][j]='X';
            }
        }
            for(int j=0;j<m;j++){
                if(!visited[0][j]){
                    dfs(0,j,visited,board);
                }
                 if(!visited[n-1][j]){
                    dfs(n-1,j,visited,board);
                }
            }
             for(int j=0;j<n;j++){
                if(!visited[j][0]){
                    dfs(j,0,visited,board);
                }
                 if(!visited[j][m-1]){
                    dfs(j,m-1,visited,board);
                }
            }
        }
        void dfs(int r,int c,boolean [][]visited,char [][] ans){
            visited[r][c]=true;
            ans[r][c]='O';
            int n=ans.length;
            int m=ans[0].length;
            int [] dr=new int[]{-1,0,1,0};
            int dc[]=new int[]{0,1,0,-1};
            for(int i=0;i<4;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];
                if(nr>=0&&nr<n&&nc>=0&&nc<m&&!visited[nr][nc]){
                    dfs(nr,nc,visited,ans);
                }
            }
        }
    }
