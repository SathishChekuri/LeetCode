class Solution {
    public boolean check(int[] nums) {
        boolean rotated=false;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                if(rotated) return false;
                rotated=true;
            }
        }
        if(rotated){
            if(nums[0]<nums[nums.length-1]) return false;
        }
        return true;
    }
}