class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        if(nums[n]>=0){
            if(nums[n]>=0&&nums[n-1]<0&&n>=3) return Math.max(nums[n-1]*nums[n-2]*nums[n],nums[0]*nums[1]*nums[n]); 
            return Math.max(nums[n]*nums[n-1]*nums[n-2],nums[0]*nums[1]*nums[n]);
        }
        return nums[n-2]*nums[n-1]*nums[n]; 
    }
}