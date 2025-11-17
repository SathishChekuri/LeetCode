class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k>0){
            int m=0;
            for(int i=1;i<nums.length;i++){
                if(nums[m]>nums[i]) m=i;
            }
            nums[m]*=multiplier;
            k--;
        }
        return nums;
    }
}