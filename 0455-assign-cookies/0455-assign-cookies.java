class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int c=0,i=0,j=0;
        int gg=g.length,ss=s.length;
        while(i<gg&&j<ss){
            if(g[i]<=s[j]){
                c++;
                i++;
            }
            j++;
        }
        return c;
    }
}