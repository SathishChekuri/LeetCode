class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for(int ar[]:queries){
            while(ar[0]<=ar[1]){
                nums[ar[0]]=(int)(((long)nums[ar[0]]*ar[3])%1000000007);
                ar[0]+=ar[2];
            }
        }
        int xor=0;
        for(int i:nums) xor^=i;
        return xor;
    }
}