class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1,ml=height[0],mr=height[height.length-1];
        int res=0;
        while(l<r){
            if(height[l]<height[r]){
                mr=Math.max(mr,height[r]);
                res=Math.max(res,(r-l)*Math.min(height[l],mr));
                l++;
            }
            else{
                ml=Math.max(ml,height[l]);
                res=Math.max(res,(r-l)*Math.min(height[r],ml));
                r--;
            }
        }
         return res;
    }
}