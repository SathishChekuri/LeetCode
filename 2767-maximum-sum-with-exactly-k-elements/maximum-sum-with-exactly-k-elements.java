class Solution {
    public int maximizeSum(int[] nums, int k) {
        int mx=nums[0];
        int s=0;
        for(int i=1;i<nums.length;i++){
            if(mx<nums[i]) mx=nums[i];
        }
        for(int i=0;i<k;i++) s+=(mx+i);
        return s;
    }
}