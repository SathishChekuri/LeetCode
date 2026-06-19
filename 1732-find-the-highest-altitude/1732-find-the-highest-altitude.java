class Solution {
    public int largestAltitude(int[] gain) {
        int mx=0,sum=0;
        for(int i:gain){
            sum+=i;
            mx=Math.max(sum,mx);
        }
        return mx;
    }
}