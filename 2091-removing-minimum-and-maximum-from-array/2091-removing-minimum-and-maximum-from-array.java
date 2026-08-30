class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1) return 1;
        int mn=0,mx=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[mn]) mn=i;
            if(nums[i]>nums[mx]) mx=i;
        }
       // System.out.println(nums[mx]+" "+nums[mn]);
        int l=mn,r=mx;
        if(mn>mx){
            l=mx;
            r=mn;
        }
        return Math.min(l+1+nums.length-r,Math.min(r+1,nums.length-l));
    }
}