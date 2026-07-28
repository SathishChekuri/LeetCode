class Solution {
    public int findDuplicate(int[] nums) {
        int s=0,fs=0;
        while(s==0||(s!=fs)){
            s=nums[s];
            fs=nums[nums[fs]];
        }
        s=0;
        while(s==0||(s!=fs)){
            s=nums[s];
            fs=nums[fs];
        }
        return s;
    }
}