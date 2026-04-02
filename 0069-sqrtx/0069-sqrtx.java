class Solution {
    public int mySqrt(int x) {
        long i=0,j=x/2+1;
        while(i<=j){
          long mid=(i+j)/2;
          if((int)mid*mid==x) return (int)mid;
          else if((int)mid*mid>x) j=mid-1;
          else i=mid+1;

        }
        return (int)j;
    }
}