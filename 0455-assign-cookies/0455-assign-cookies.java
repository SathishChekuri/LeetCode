class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int c=0;
        for(int i:g){
            for(int j=0;j<s.length;j++){
                if(s[j]>=i){
                    s[j]=0;
                    c++;
                    break;
                }
            }
        }
        return c;
    }
}