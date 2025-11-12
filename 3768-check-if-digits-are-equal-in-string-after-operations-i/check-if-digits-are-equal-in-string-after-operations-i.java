class Solution {
    public boolean hasSameDigits(String s) {
       int a[]=new int[s.length()];
       for(int i=0;i<a.length;i++) a[i]=s.charAt(i)-'0'; 
       int [] a1=new int[a.length];
       for(int i=0;i<a.length-2;i++){
        for(int j=1;j<a.length-i;j++){
            a1[j-1]=(a[j]+a[j-1])%10;
        }
        a=a1;
       }
         return a[0]==a[1];
    }
}