class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        for(int [] ar: accounts){
            int s=0;
            for(int j: ar) s+=j;
            if(max<s) max=s;
        }
        return max;
    }
}