class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ar=new ArrayList<>();
        int n=grid.length;
        int m=grid[0].length;
        k=k%(n*m);
        //if(k==0) k=2.....n=7,m=1..p=4
        int p=n*m-k-1;
        for(int i=0;i<n;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<m;j++){
                p++;
                if(p>=n*m) p=0;
                row.add(grid[p/m][p%m]);         
            }
            ar.add(row);
        }
         return ar;
    }
}