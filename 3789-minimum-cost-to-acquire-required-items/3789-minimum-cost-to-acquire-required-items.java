class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        if(costBoth<cost1+cost2){
            return Math.min(Math.max(need1,need2)*(long)costBoth,Math.min(need1,need2)*(long)costBoth+((need1>need2)?(need1-need2)*(long)cost1:(need2-need1)*(long)cost2));
        }
        return cost1*(long)need1+cost2*(long)need2;
    }
}