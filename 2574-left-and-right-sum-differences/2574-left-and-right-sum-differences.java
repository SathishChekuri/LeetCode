class Solution {
    public int[] leftRightDifference(int[] nums) {
        int prfs[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            prfs[i+1]=prfs[i]+nums[i];
        }
        int tt=prfs[nums.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(prfs[i]-(tt-prfs[i+1]));
        }
        return nums;
    }
}