class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        int mx=0;
        while(l<r){
            int sum=nums[l]+nums[r];
            mx=Math.max(sum,mx);
            l++;
            r--;
        }
        return mx;
    }
}