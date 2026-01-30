class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int dis=Integer.MAX_VALUE;
        Arrays.sort(nums);
        int res=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int s=nums[i]+nums[j]+nums[k];
                if(Math.abs(s-target)<Math.abs(res-target)) res=s;
                if(s>target){
                    k--;
                    while(j<k&&nums[k]==nums[k+1]) k--;
                }
                else {
                    j++;
                     while(j<k&&nums[j]==nums[j-1]) j++;
                }
            }
        }
        return res;
    }
}