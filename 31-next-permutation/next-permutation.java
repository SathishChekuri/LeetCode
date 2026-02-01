class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        for(int i=n-1;i>=0;i--){
            /**if(nums[n-1]==0){
                for(int j=0;j<i-1;j++){
                    if(nums[j]!=0){
                        int t=nums[i];
                        nums[i]=nums[j];
                        nums[j]=t;
                        return;
                    }
                }
            }**/
            for(int j=i+1;j<n;j++){
                if(nums[j]>nums[i]){
                    int t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                    return;
                }
            }
            for(int j=i;j<n-1;j++){
                if(nums[j]>nums[j+1]){
                    int t=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=t;
                }
            }
        }
        return;
    }
}