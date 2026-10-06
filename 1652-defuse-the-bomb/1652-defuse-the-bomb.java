class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int ans[]= new int[n];
        if(k==0) return ans;
        int prf[]=new int[n+1];
        for(int i=1;i<prf.length;i++){
            prf[i]=prf[i-1]+code[i-1];
        }
        if(k>0){
            for(int i=0;i<n;i++){
                if((i+k)<n) ans[i]=prf[i+k+1]-prf[i+1];
                else{
                 int l=(i+k+1)%n;
                 ans[i]=prf[n]-prf[i+1]+prf[l];
                }
            }
            return ans;
        }
        else{
             for(int i=0;i<n;i++){
                if((i+k)>=0) ans[i]=prf[i]-prf[i+k];
                else{
                 int r=(n+(i+k))%n;
                 ans[i]=prf[n]-prf[r]+((i>0)?prf[i]:0);
                }
            }
            return ans;
        }
    }
}