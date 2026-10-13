class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++) nums[i]=Math.abs(nums[i]);
        Arrays.sort(nums);
        int n=nums.length,l=0,r=n/2;
        long ans=0;
        int t=r;
       while(l<r&&t<n){
           ans+=((long)nums[t]*nums[t]-(long)nums[l]*nums[l]);
           l++;
           t++;
        }
        while(t<n){
            ans+=nums[t]*nums[t];
            t++;
        }
        return ans;
    }
}