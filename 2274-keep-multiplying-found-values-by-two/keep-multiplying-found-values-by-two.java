class Solution {
    public int findFinalValue(int[] nums, int original) {
        //int s=original;
        while(true){
            int c=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==original){
                    c=1;
                    original*=2;
                   // s=original;
                }
            }
            if(c==0) break;
        }
        return original;
    }
}