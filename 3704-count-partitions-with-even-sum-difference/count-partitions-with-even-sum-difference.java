class Solution {
    public int countPartitions(int[] nums) {
        int count=0,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int pre=0,suf=0;
        for(int i=0;i<nums.length-1;i++){
           pre+=nums[i];
           suf=sum-pre;
           if((pre-suf)%2==0) count++;
           else break;
        }
        return count;
    }
}