class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long [] row=new long[grid.length];
        long [] col=new long[grid[0].length];
         long cs=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                cs+=grid[i][j];
            }
            row[i]=cs;
        }
        cs=0;
         for(int i=0;i<grid[0].length;i++){
            for(int j=0;j<grid.length;j++){
                cs+=grid[j][i];
            }
            col[i]=cs;
        }
        for(int i=0;i<row.length;i++){
           if(row[row.length-1]-row[i]==row[i]) return true;
        }
        for(int i=0;i<col.length;i++){
           if(col[col.length-1]-col[i]==col[i]) return true;
        }
        return false;
    }
}