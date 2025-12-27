class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=s.length()/k;
        if(s.length()%k!=0) n++;
        String ar[]=new String[n];
        int t=0;
        for(int i=0;i<n;i++){
           if(t+k<s.length()){
            ar[i]=s.substring(t,t+k);
            t+=k;
           }
           else{
            ar[i]=s.substring(t,s.length());
            while(ar[i].length()<k) ar[i]+=fill;
           }
        }
        return ar;
    }
}