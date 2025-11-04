class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int [] ar=new int [128];
        for(char ch:s.toCharArray()) ar[ch]++;
        for(char ch:t.toCharArray()) ar[ch]--;
        for(char ch:s.toCharArray()){
            if(ar[ch]!=0) return false;
        }
        return true;
    }
}