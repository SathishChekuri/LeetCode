class Solution {
    public int uniqueXorTriplets(int[] nums) {
        if(nums.length<=2) return nums.length;
        int mask=0;
        for(int i=0;i<nums.length;i++){
           mask|=nums[i];
        }
        return mask+1;
    }
}