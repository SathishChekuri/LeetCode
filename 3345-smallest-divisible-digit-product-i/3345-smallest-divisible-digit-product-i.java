class Solution {
    public int smallestNumber(int n, int t) {
       while(true){
        int sum=1;
        int temp=n;
        while(temp>0){
            sum*=temp%10;
            temp/=10;
        }
        if(sum%t==0) return n;
        n++; 
       }
    }
}