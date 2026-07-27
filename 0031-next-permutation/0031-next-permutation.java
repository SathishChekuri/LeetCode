class Solution {
    public void nextPermutation(int[] nums) {
        int ind=-1,mx=0;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            reverse(0,nums.length-1,nums);
            return;
        }
        for(int i=nums.length-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                mx=i;
                break;
            }
        }
        if(ind!=-1) swap(ind,mx,nums);
        reverse(ind+1,nums.length-1,nums);
    }
    void swap(int i,int j,int [] arr){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    void reverse(int i,int j,int [] ar){
        while(i<j){
            int t=ar[i];
            ar[i]=ar[j];
            ar[j]=t;
            i++;
            j--;
        }
    }
}