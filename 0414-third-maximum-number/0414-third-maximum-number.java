class Solution {
    public int thirdMax(int[] nums) {
        long mx1=Long.MIN_VALUE,mx2=mx1,mx3=mx1;
        for(int i:nums){
            if(i==mx1||i==mx2||i==mx3) continue;
            else if(i>mx1){
                 mx3=mx2;
                 mx2=mx1;
                mx1=i;
            }
            else if(i>mx2){
                mx3=mx2;
                mx2=i;
            }
            else if(i>mx3) mx3=i;
        }
        return mx3==Long.MIN_VALUE?(int)mx1:(int)mx3;
    }
}