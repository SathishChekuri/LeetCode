class Solution {
    public int alternatingSum(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++){
            s+=(i%2==0)?nums[i]:(-nums[i]);
        }
        return s;
    }
}