class Solution {
    public boolean checkPerfectNumber(int num) {
        int s=1;
        for(int i=2;i<=num/2;i++){
            if(num%i==0) s+=i;
        }
        return num==s&&num!=1; 
    }
}