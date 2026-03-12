class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=0,j=nums.length-1;
        while(i<=j){
            int m=(i+j)/2;
            if(nums[m]==target){
                int res=m;
                int res1=m;
                while(res+1<nums.length&&nums[res+1]==target) res++;
                while(res1-1>=0&&nums[res1-1]==target) res1--;
                return new int[]{res1,res};
            }
            else if(nums[m]>target) j=m-1;
            else i=m+1;
        }
        return new int[]{-1,-1};
    }
}