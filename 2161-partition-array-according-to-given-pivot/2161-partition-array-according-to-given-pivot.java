class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int ar[]=new int[n];
        int ind=0;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                ar[ind++]=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==pivot) ar[ind++]=nums[i];
        }
        for(int i=0;i<n;i++){
            if(nums[i]>pivot) ar[ind++]=nums[i];
        }
        return ar;
    }
}