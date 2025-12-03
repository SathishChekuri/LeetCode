class Solution {
    public int maximum69Number (int num) {
        int ar[]=new int[num/10+1];
        for(int i=ar.length-1;i>=0;i--){
            ar[i]=num%10;
            num/=10;
        }
        for(int i=0;i<ar.length;i++){
         if(ar[i]==6){
            ar[i]=9;
            break;
         }
        }
        int x=0;
        for(int i:ar) x=x*10+i;
        return x;
    }
}