class Solution {
    public int minimumDeletions(String s) {
        int ans=0,cnt=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b') cnt++;
            else if (cnt>0){
                cnt--;
                ans++;
            }
        }
        return ans;
    }
}