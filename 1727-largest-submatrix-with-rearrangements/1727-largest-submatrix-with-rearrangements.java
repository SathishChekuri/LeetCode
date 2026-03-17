class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==1){
                    matrix[i][j]=matrix[i-1][j]+1;
                }
            }
        }
        int ans=0;
        for(int arr[]:matrix){
            Arrays.sort(arr);
            for(int i=n-1,k=1;i>=0&&arr[i]>0;i--,k++){
                ans=Math.max(ans,arr[i]*k);
            }
        }
        return ans;
    }
}