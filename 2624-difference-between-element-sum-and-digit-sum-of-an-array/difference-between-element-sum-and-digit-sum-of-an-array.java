class Solution {
    public int differenceOfSum(int[] nums) {
        int s=0;
        for(int i:nums){
            s+=i;
            while(i>0){
                s-=(i%10);
                i/=10;
            }
        }
        return s;
    }
}