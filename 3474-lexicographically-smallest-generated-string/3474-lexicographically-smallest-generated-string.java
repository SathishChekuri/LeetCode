class Solution {
    public String generateString(String str1, String str2) {
        int n=str1.length(),m=str2.length();
        char [] a=new char[n+m-1];
        for(int i=0;i<n;i++){
            if(str1.charAt(i)=='T'){
                for(int j=0;j<m;j++){
                    char c=str2.charAt(j);
                    if(a[i+j]!=0&&a[i+j]!=c) return "";
                    a[i+j]=c;
                }
            }
        }
        char [] b=a.clone();
        for(int i=0;i<a.length;i++){
            if(a[i]==0) a[i]='a';
        }
         for(int i=0;i<n;i++){
            if(str1.charAt(i)=='F'&&new String(a,i,m).equals(str2)){
                boolean eqls=false;
                for(int j=i+m-1;j>=i;j--){
                    if(b[j]==0){
                        a[j]='b';
                        eqls=true;
                        break;
                    }
                }
                    if(!eqls) return "";
                }
            }
            return new String(a);
    }
}