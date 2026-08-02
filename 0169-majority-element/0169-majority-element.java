class Solution {
    public int majorityElement(int[] nums) {
        int c=0,curr=0;
        for(int i=0;i<nums.length;i++){
            if(c==0){
                curr=nums[i];
                c=1;
            }
            else if(nums[i]==curr) c++;
            else c--;
        }
        return curr;
    }
}