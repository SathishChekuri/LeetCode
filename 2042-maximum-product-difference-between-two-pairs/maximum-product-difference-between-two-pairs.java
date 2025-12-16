class Solution {
    public int maxProductDifference(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int s=nums[i],c=i;
            for(int j=i+1;j<n;j++){
                if(nums[j]<s){
                    s=nums[j];
                    c=j;
                }
            }
            if(c!=i){
                int t=nums[i];
                nums[i]=nums[c];
                nums[c]=t;
            }
        }
        return ((nums[n-1]*nums[n-2])-(nums[0]*nums[1]));
    }
}