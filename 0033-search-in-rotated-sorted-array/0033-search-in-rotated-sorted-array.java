class Solution {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<=r){
            int md=(l+r)/2;
            if(nums[md]==target) return md;
            else if(nums[md]>=nums[l]){
                if(nums[l]<=target&&target<nums[md]) r=md-1;
                else l=md+1;
            }
            else{
                if(nums[md]<target&&nums[r]>=target) l=md+1;
                else r=md-1;
            }
        }
        return -1;
    }
}