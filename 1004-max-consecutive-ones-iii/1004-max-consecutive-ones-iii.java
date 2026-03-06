class Solution {
    public int longestOnes(int[] nums, int k) {
        int f=0;//no.of flips
        int c=0;//no of 1s in the aray
        int mxl=0;
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0) f++;
            if(f>k){
                while(i<=j&&f>k){
                    if(nums[i]==1) c--;
                   else  f--;
                   i++;
                }
            }
           mxl=Math.max(mxl,j-i+1);
        //max length
        }
        return mxl;
    }
}