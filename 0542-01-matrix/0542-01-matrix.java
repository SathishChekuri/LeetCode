class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int [][] ans=new int[n][m];
        boolean visited[][]=new boolean[n][m];
        Queue<Node> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    q.add(new Node(i,j,0));
                    ans[i][j]=0;
                    visited[i][j]=true;
                }
            }
        }
        int [] dr=new int[]{-1,0,+1,0};
        int [] dc=new int[]{0,1,0,-1};
        while(!q.isEmpty()){
            Node curr=q.poll();
            int r=curr.r;
            int c=curr.c;
            int t=curr.t;
            for(int i=0;i<4;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];
                if(nr>=0&&nr<n&&nc>=0&&nc<m&&!visited[nr][nc]){
                    ans[nr][nc]=t+1;
                    q.add(new Node(nr,nc,t+1));
                    visited[nr][nc]=true;
                }
            }
        }
        return ans;
    }
}
class Node{
    int r;
    int c;
    int t;
    Node(int r,int c,int t){
        this.r=r;
        this.c=c;
        this.t=t;
    }
}