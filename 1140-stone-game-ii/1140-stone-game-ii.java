class Solution {
    public int stoneGameII(int[] piles) {
        int n=piles.length;
        int [] suffix=new int[n+1];
        for(int i=n-1;i>=0;i--) suffix[i]=suffix[i+1]+piles[i];
        int [][]dp=new int[n][n];
        return helper(0,1,suffix,dp,n);
    }
    int helper(int i,int m,int [] suffix,int [][]dp,int n){
        if(i>=n) return 0;
        if(2*m>=n-i) return suffix[i];
        if(dp[i][m]!=0) return dp[i][m];
        int ans=0;
        for(int x=1;x<=2*m;x++){
            int opn=helper(i+x,Math.max(m,x),suffix,dp,n);
            ans=Math.max(ans,suffix[i]-opn);
        }
        return dp[i][m]=ans;
    }
}