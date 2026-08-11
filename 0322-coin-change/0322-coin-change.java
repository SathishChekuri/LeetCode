class Solution {
    int dp[][];
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
         dp=new int[n][amount+1];
         for(int [] ar:dp){
            Arrays.fill(ar,-1);
         }
        int ans=f(n-1,amount,coins);
        if(ans>=1000000000) return -1;
        return ans;
    }
    int f(int ind,int targ,int [] coins){
        if(dp[ind][targ]!=-1) return dp[ind][targ];
        if(ind==0){
            if(targ%coins[ind]==0) return targ/coins[ind];
            return 1000000000;
        }
        int nottake=0+f(ind-1,targ,coins);
        int take=1000000000;
        if(coins[ind]<=targ){
            take=1+f(ind,targ-coins[ind],coins);
        }
        return dp[ind][targ]=Math.min(take,nottake);
    }
}