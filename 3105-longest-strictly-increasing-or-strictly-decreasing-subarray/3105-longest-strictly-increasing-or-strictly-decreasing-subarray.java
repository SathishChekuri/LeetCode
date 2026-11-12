class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int up=1,down=1,best=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                down++;
            }
            else down=1;
            if(nums[i-1]<nums[i]) up++;
            else up=1;
            best=Math.max(best,Math.max(down,up));
        }
        return best;
    }
}