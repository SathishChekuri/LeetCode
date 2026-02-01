class Solution {
    public int minimumCost(int[] nums) {
        int s=nums[0];
        int mn1=nums[1],mn2=nums[2];
        for(int i=2;i<nums.length;i++){
            if(nums[i]<mn1){
                mn2=mn1;
                mn1=nums[i];
            }
            else if(nums[i]<mn2) mn2=nums[i];
        }
        return s+mn1+mn2;
    }
}