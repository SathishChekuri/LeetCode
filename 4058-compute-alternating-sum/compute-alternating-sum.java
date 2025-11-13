class Solution {
    public int alternatingSum(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i+=2) s+=nums[i];
           // s+=(i%2==0)?nums[i]:(-nums[i]);
       // }
         for(int i=1;i<nums.length;i+=2) s-=nums[i];
        return s;
    }
}