class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,mx=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum=Math.max(sum+nums[i],nums[i]);
            mx=Math.max(mx,sum);
        }
        return mx;
    }
}