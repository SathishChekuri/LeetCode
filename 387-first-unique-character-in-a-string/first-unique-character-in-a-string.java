class Solution {
    public int firstUniqChar(String s) {
        int n=Integer.MAX_VALUE;
        for(int i='a';i<='z';i++){
            if(s.indexOf(i)!=-1&&s.indexOf(i)==s.lastIndexOf(i)) n=Math.min(n,s.indexOf(i));
        }
        return (n==Integer.MAX_VALUE)?-1:n;
    }
}