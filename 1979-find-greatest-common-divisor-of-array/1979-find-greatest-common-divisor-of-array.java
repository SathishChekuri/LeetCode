class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE,mx=0;
        for(int i:nums){
            min=Math.min(min,i);
            mx=Math.max(mx,i);
        }
        return gcd(min,mx);
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