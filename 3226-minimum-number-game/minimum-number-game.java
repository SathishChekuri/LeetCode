class Solution {
    public int[] numberGame(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int sml=nums[i];
            int loc=i;
            for(int j=i;j<n;j++){
                if(sml>nums[j]){
                    sml=nums[j];
                    loc=j;
                }
            }
            int t=nums[i];
            nums[i]=nums[loc];
            nums[loc]=t;
        }
        int i=0,j=0;
       // Arrays.sort(nums);
        int arr[]=new int[n];
        while(i<n){
            int s1=nums[i++];
            int s2=nums[i++];
            arr[j++]=s2;
            arr[j++]=s1;
        }
        return arr;
    }
}