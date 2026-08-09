class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1,j=1,c=0;
        while(j<nums.length){
            if(nums[j]!=nums[j-1]){
                nums[i]=nums[j];
                i++;
                c++;
            }
            j++;
        }
        return c+1;
    }
}