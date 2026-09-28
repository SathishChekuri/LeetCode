class Solution {
    public int maxDepth(String s) {
        int op=0,mx=0;
        for(char c:s.toCharArray()){
            if(c=='(') op++;
            else if(c==')') op--;
            mx=Math.max(op,mx);
        }
        return mx;
    }
}