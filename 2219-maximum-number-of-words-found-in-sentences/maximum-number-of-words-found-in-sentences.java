class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String s:sentences){
         int len=s.split(" ").length;
           max=Math.max(max,len);
        }
        return max;
    }
}