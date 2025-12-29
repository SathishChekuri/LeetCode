class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int [][]ar=new int[m][n];
        int c=0;
        for(int i=0;i<indices.length;i++){
                for(int k=0;k<n;k++){
                    ar[indices[i][0]][k]++;
                }
                for(int k=0;k<m;k++){
                    ar[k][indices[i][1]]++;
                }
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(ar[i][j]%2!=0) c++;
                }
            }
        return c;
    }
}