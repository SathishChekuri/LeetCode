class Solution {
    public int thirdMax(int[] nums) {
        long mx1=(long)Integer.MIN_VALUE-1,mx2=mx1,mx3=mx1;
        for(int i:nums){
            if(i>=mx1){
                if(i!=mx1){
                    mx3=mx2;
                    mx2=mx1;
                 }
                mx1=i;
            }
            else if(i>=mx2){
               if(i!=mx2) mx3=mx2;
                mx2=i;
            }
            else if(i>mx3) mx3=i;
        }
        return mx3==(long)Integer.MIN_VALUE-1?(int)mx1:(int)mx3;
    }
}