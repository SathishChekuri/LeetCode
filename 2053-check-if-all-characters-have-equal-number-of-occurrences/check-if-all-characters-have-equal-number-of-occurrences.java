class Solution {
    public boolean areOccurrencesEqual(String s) {
        int [] ar=new int[26];
        for(char x:s.toCharArray()) ar[x-'a']++;
        int a=ar[s.charAt(0)-'a'];
        for(char x:s.toCharArray()){
            if(ar[x-'a']!=a) return false;
        }
        return true;
    }
}