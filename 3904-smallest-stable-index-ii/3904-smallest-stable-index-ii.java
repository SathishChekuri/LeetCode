class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int mn=-1,mx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[mx]) mx=i;
            if(mn<i){
                mn=i;
                for(int j=i+1;j<nums.length;j++){
                    if(nums[mn]>=nums[j]) mn=j;
                }
            }
            if(nums[mx]-nums[mn]<=k) return i;;
        }
        return -1;
    }
}