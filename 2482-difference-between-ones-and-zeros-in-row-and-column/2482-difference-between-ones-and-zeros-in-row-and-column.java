class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        //ones in row and col
       int r[]=new int[n];
       int c[]=new int[m];
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==1){
                r[i]++;
                c[j]++;
            }
        }
       }
       int [][] ans=new int[n][m];
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            int ones=r[i]+c[j];
            int zeros=m+n-ones;
            ans[i][j]=ones-zeros;
        }
       }
       return ans;
    }
}