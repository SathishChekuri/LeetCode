class Solution {
    public int trap(int[] height) {
        int i=0,j=height.length-1,rm=height[height.length-1],lm=height[0];
        int res=0;
        while(i<j){
            if(height[i]>height[j]){
                if(height[j]<rm){
                    res+=rm-height[j];
                }
                else rm=height[j];
                j--;
            }
            else{
                if(height[i]<lm){
                    res+=lm-height[i];
                }
                else lm=height[i];
                i++;
            }
        }
        return res;
    }
}