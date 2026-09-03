class Solution {
    public boolean uniformArray(int[] nums1) {
        int mnod=-1,mnev=-1;
        for(int i:nums1){
            if(i%2==1){
                if(mnod==-1||mnod>i) mnod=i;
            }
            else{
                if(mnev==-1||mnev>i) mnev=i;
            }
        }
        return (mnev>mnod||mnod==-1||mnev==-1);
    }
}