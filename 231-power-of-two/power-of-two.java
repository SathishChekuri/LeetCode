class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=0;i<=n;i++){
            double a=Math.pow(2,i);
            if(a==n) return true;
            if(a>n) return false;
        }
        return false;
    }
}