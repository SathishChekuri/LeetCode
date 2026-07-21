class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int pre=Integer.MIN_VALUE,mx=0,ans=0,n=s.length(),len=0;
        for(int i=0;i<n;){
            int j=i;
            while(j<n&&s.charAt(j)==s.charAt(i)){
                j++;
            }
            len=j-i;
            if(s.charAt(i)=='1'){
                ans+=len;
            }
            else{
                mx=Math.max(mx,pre+len);
                pre=len;
            }
            i=j;
        }
       return ans+mx;
    }
}