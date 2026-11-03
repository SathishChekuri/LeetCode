class Solution {
    public int minMoves(int[] nums) {
        int mx=0;
        for(int i:nums) mx=Math.max(i,mx);
        int c=0;
        for(int i:nums) c+=mx-i;
        return c;
    }
}