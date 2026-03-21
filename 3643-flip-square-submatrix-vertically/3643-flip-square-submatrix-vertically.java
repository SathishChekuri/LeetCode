class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int rmx=x+k-1;
        while(x<rmx){
               for(int i=y;i<y+k;i++){
                int t=grid[x][i];
                grid[x][i]=grid[rmx][i];
                grid[rmx][i]=t;
               }
                x++;
                rmx--;
            }
        return grid;
    }
}