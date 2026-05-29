class Solution {
    public int minElement(int[] nums) {
        int mn=nums[0];
        for(int i:nums){
            int s=0;
            while(i>0){
                s+=i%10;
                i/=10;
            }
            mn=Math.min(s,mn);
        }
        return mn;
    }
}