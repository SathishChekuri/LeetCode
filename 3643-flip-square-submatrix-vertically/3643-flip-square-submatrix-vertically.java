class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int rmx=x+k-1;
        int cmx=y+k;
        while(y<cmx){
            int i=x,j=rmx;
            while(i<j){
                int t=grid[i][y];
                grid[i][y]=grid[j][y];
                grid[j][y]=t;
                i++;
                j--;
            }
            y++;
        }
        return grid;
    }
}