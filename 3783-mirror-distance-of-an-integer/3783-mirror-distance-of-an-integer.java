class Solution {
    public int mirrorDistance(int n) {
        return Math.abs(rev(n)-n);
    }
    public int rev(int n){
        int s=0;
        while(n>0){
            s=s*10+n%10;
            n/=10;
        }
        return s;
    }
}