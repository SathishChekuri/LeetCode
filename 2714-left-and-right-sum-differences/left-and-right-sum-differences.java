class Solution {
    public int[] leftRightDifference(int[] nums) {
        int s2=0,s=0;
        for(int i:nums) s+=i;
         for(int i=0;i<nums.length;i++){
               
               int  r=s-s2-nums[i];
                int l=s2;
                s2+=nums[i];
               nums[i]=Math.abs(l-r);
               
         }
         return nums;
    }
}