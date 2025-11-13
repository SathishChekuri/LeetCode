class Solution {
    public int subsetXORSum(int[] nums) {
        return function(nums, 0, 0);
    }

    private int function(int[] nums, int index, int curr_xor) {
        if (index == nums.length) return curr_xor;

        int with_curr = function(nums, index + 1, curr_xor ^ nums[index]);
        int without_curr = function(nums, index + 1, curr_xor);

        return with_curr + without_curr;
    }
}