class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length<=1) return ;
        k%=nums.length;
        rotate(nums,0,nums.length-k-1);
        rotate(nums,nums.length-k,nums.length-1);
        rotate(nums,0,nums.length-1);
        //return num
    }
    static void rotate(int []arr,int i,int j){
        while(i<j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
    }
}