class Solution {
    public long gcdSum(int[] nums) {
        int mx=nums[0];
        for(int i=0;i<nums.length;i++){
            mx=Math.max(nums[i],mx);
            nums[i]=gcd(nums[i],mx);
        }
        int i=0,j=nums.length-1;
        Arrays.sort(nums);
        long sum=0;
        while(i<j){
            sum+=gcd(nums[i],nums[j]);
            i++;
            j--;
        }
        return sum;   
    }
    int gcd(int a,int b){
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
}