class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean res=true;
        int n=mat.length,m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]!=target[j][n-i-1]){
                    res=false;
                    break;
                }
            }
        }
        if(res) return res;
        res=true;
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]!=target[n-1-i][m-1-j]){
                    res=false;
                    break;
                }
            }
        }
        if(res) return res;
        res=true;
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]!=target[n-1-j][i]){
                    res=false;
                    break;
                }
            }
        }
        if(res) return res;
        res=true;
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]!=target[i][j]){
                    res=false;
                    break;
                }
            }
        }
        return res;
    }
}