class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String s:sentences){
            int len=s.split(" ").length;
            if(max<len) max=len;
        }
        return max;
    }
}