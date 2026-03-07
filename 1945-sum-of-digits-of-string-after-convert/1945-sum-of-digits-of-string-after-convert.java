class Solution {
    public int getLucky(String s, int k) {
        String t="";
        for(char c:s.toCharArray()){
              t+=(c-'a'+1);
        }
        int res=0;
        while(k-->0){
            res=0;
           for(char c:t.toCharArray()){
            res+=c-'0';
           }
           t=res+"";
        }
        return res;
    }
}