class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,mx=0;
        int [] ar=new int[128];
        while(j<s.length()){
            ar[s.charAt(j)]++;
            while(ar[s.charAt(j)]>1){
                ar[s.charAt(i)]--;
                i++;
            }
            mx=Math.max(j+1-i,mx);
            j++;

        }
        return mx;
    }
}