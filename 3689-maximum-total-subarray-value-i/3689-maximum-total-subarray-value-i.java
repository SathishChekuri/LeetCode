class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long mn=Integer.MAX_VALUE;
        long mx=0;
        for(int i:nums){
            if(i<mn) mn=i;
            if(i>mx) mx=i;
        }
        return (mx-mn)*k*1L;
    }
}