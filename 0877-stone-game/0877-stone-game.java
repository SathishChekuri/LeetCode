class Solution {
    int dp[][];
    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        dp=new int[n][n];
        for(int []r:dp) Arrays.fill(r,-1);
        helper(0,n-1,piles);
        return dp[0][n-1]>0;
    }
   int helper(int i,int j,int[] piles){
        if(i>j) return 0;
        if(i==j) return piles[i];
        if(dp[i][j]!=-1) return dp[i][j];
        return dp[i][j]=Math.max(piles[i]-helper(i+1,j,piles),piles[j]-helper(i,j-1,piles));
    }

}