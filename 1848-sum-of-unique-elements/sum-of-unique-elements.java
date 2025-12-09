class Solution {
    public int sumOfUnique(int[] nums) {
        Arrays.sort(nums);
        int s=0;
        int i=0;
        int n=nums.length;
        if((n==1)||(n>1&&nums[i]!=nums[i+1])) s+=nums[i];
        for(i=1;i<n-1;i++){
            if(nums[i]!=nums[i+1]&&nums[i]!=nums[i-1]) s+=nums[i];
        }
        if(n>1&&nums[i-1]!=nums[i]) s+=nums[i];
        return s;
    }
}