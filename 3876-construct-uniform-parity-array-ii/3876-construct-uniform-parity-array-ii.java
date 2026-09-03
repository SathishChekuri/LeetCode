class Solution {
    public boolean uniformArray(int[] nums1) {
        int mxod=-1,mnod=-1,mxev=-1,mnev=-1;
        for(int i:nums1){
            if(i%2==1){
                if(mxod<i||mxod==-1) mxod=i;
                if(mnod==-1||mnod>i) mnod=i;
            }
            else{
                if(mnev==-1||mnev>i) mnev=i;
                if(mxev==-1||mxev<i) mxev=i;
            }
        }
        return (mnev>mnod||mnod==-1||mnev==-1);
    }
}