class Solution {
    public int minimumOperations(int[] nums) {
        int s=0;
        for(int i:nums) s+=(i%3==0)?0:1;
        return s;
    }
}