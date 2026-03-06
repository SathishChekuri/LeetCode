class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int mxc=0;
        for(int i: nums){
            if(i==1) c++;
            else{
                if(mxc<c) mxc=c;
                c=0;
            }
        }
        if(mxc<c) mxc=c;
        return mxc;
    }
}