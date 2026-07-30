class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int ans=0,prs=1;
        while(n>=8){
            n-=8;
            ans+=(8*prs);
            prs++;
        }
        ans+=(n*prs);
        return ans;
    }
}