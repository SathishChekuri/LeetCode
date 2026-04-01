class Solution {
    public int commonFactors(int a, int b) {
        if(a<b) return findf(a,b);
        else return findf(b,a);
    }
    int findf(int a,int b){
        int c=1;
        for(int i=2;i<a/2+1;i++){
            if(a%i==0&&b%i==0) c++;
        }
        if(a!=1&&b%a==0) c++;
        return c;
    }
}