class Solution {
    public String[] createGrid(int m, int n) {
        String [] ans=new String[m];
        if(m==1){
            String s="";
            for(int i=0;i<n;i++) s+='.';
            ans[0]=s;
            return ans;
        }
        for(int i=0;i<m;i++){
            char[] r=new char[n];
            Arrays.fill(r,'#');
            if(i<n-1){
                r[i]='.';
                r[i+1]='.';
            }
            else r[n-1]='.';
            if(i==m-1){
                int t=i;
                while(t<n) r[t++]='.';
            }
            ans[i]=new String(r);
        }
        return ans;
    }
}