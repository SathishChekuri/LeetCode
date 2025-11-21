class Solution {
    public int search(int[] nums, int target) {
        int i=0;
        int n=nums.length-1;
        while(i<=n){
            int md=(i+n)/2;
            if(target==nums[md]) return md;
            else if(nums[md]<target) i=md+1;
            else if(nums[md]>target) n=md-1; 
        }
        return -1;
    }
}