class Solution {
    int [] dp;
    public int climbStairs(int n) {
        dp=new int[n+1];
        return ways(n);
    }
    int ways(int n){
        if(n<0) return 0;
        if(n==0) return 1;
        if(dp[n]!=0) return dp[n];
        dp[n]=ways(n-2)+ways(n-1);
        return dp[n];
    }
}