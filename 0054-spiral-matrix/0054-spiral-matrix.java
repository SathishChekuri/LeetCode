class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr=new ArrayList<>();
        int n=matrix.length-1,m=matrix[0].length-1;
        int r=0,c=0;
        while(r<=n&&c<=m){
            for(int j=c;j<=m;j++) arr.add(matrix[r][j]);
            r++;
            for(int i=r;i<=n;i++) arr.add(matrix[i][m]);
            m--;
            if(r<=n){
            for(int i=m;i>=c;i--) arr.add(matrix[n][i]);
            n--;
            }
            if(c<=m){
            for(int i=n;i>=r;i--) arr.add(matrix[i][c]);
            c++;
            }
        }
        return arr;
    }
}