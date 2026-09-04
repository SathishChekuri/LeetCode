class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int mx=0,mn=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<nums[mn]) mn=i;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[mx]) mx=i;
            if(i>mn){
                mn=i;
                for(int j=i;j<nums.length;j++){
                    if(nums[j]<nums[mn]) mn=j;
                }
            }
            int score=nums[mx]-nums[mn];
            if(score<=k) return i;
        }
        return -1;
    }
}