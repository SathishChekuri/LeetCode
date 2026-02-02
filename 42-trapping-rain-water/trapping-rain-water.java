class Solution {
    public int trap(int[] height) {
        int res=0;
        int mx1=0,mx2=0;
        int i=0,j=height.length-1;
         while(i<j){
            if(height[i]<=height[j]){
            if(mx1<height[i]) mx1=height[i];
            else res+=mx1-height[i];
            i++;
            }
            else{
                if(height[j]>mx2) mx2=height[j];
                else res+=mx2-height[j];
                j--;
            }
         }
         return res;
         }
}