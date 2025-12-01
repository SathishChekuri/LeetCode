class Solution {
    public double minimumAverage(int[] nums) {
        double avg[]=new double[nums.length/2];
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n/2;i++){
            avg[i]=(double)(nums[i]+nums[n-i-1])/2;
        }
        Arrays.sort(avg);
        return avg[0];
    }
}