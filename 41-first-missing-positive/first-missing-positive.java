class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
            while(i<nums.length){
                if(nums[i]<=nums.length&&nums[i]>0&&nums[nums[i]-1]!=nums[i]){
                int t=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=t;
              }
               else i++;
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1) return i+1;
        }
        return nums.length+1;
    }
}