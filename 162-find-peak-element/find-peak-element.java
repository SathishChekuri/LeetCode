class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length-1;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[i+1]){
                if(i==0||nums[i]>nums[i-1]) return i;
            }
        }
        if(n>0&&nums[n]>nums[n-1]) return n;
        return n;
    }
}