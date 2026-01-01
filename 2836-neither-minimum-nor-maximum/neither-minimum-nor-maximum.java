class Solution {
    public int findNonMinOrMax(int[] nums) {
        int mx=Integer.MIN_VALUE;
        int mn=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>mx){
            if(mn>mx&&mx!=Integer.MIN_VALUE) mn=mx;
            mx=nums[i];
            }
            else if((nums[i]<mn||mn==Integer.MIN_VALUE)&&nums[i]!=mx) mn=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if((nums[i]!=mn)&&(nums[i]!=mx)) return nums[i];
        }
        return -1;
    }
}