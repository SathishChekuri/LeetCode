class Solution {
    int dp[][];
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
        return findways(0,0,dp);
    }
    int findways(int i,int j,int [][]dp){
        if(i==dp.length-1&&j==dp[0].length-1) return 1;
        if(i>dp.length-1||j>dp[0].length-1) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        return dp[i][j]=findways(i+1,j,dp)+findways(i,j+1,dp);
    }
}