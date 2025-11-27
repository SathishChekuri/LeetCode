class Solution {
    public int res(int a[][],int x,int y){
         int s=Integer.MIN_VALUE;
                for(int k=x;k<x+3;k++){
                    for(int l=y;l<y+3;l++){
                        s=(s>a[k][l])?s:a[k][l];
                    }
                }
                return s;
    }
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int ar[][]=new int[n-2][n-2];
        for(int i=0;i<n-2;++i){
            for(int j=0;j<n-2;++j){
                ar[i][j]=res(grid,i,j);           
            }
        }
        return ar;
    }
}