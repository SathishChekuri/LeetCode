class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int []ar=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int j=(i+1)%nums.length;
            while(i!=j){
                if(nums[j]>nums[i]){
                    ar[i]=nums[j];
                    break;
                }
                j=(j+1)%nums.length;
            }
            if(j==i) ar[i]=-1;
        }
        return ar;
    }
}