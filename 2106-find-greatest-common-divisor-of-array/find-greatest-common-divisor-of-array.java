class Solution {
    public int findGCD(int[] nums) {
        int mn=Integer.MAX_VALUE;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) return 1;
            if(mx<nums[i]){
                if(mn==Integer.MAX_VALUE&&mx!=Integer.MIN_VALUE) mn=mx;
                mx=nums[i];
            }
            else if(mn>nums[i]) mn=nums[i];
        }
        while(mn>0){
            int t=mn;
            mn=mx%mn;
            mx=t;
        }
        return mx;
    }
}