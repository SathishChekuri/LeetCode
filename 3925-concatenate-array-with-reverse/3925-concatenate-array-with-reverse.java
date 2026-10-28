class Solution {
    public int[] concatWithReverse(int[] nums) {
      int i=0,j=nums.length*2-1;
      int [] new_nums=new int[nums.length*2];
      while(i<j){
        new_nums[i]=nums[i];
        new_nums[j]=nums[i];
        i++;
        j--;
      }
      return new_nums;
    }
}