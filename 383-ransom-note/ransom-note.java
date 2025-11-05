class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int ar[]=new int[26];
        for(char c:magazine.toCharArray()) ar[c-'a']++;
        for(char c:ransomNote.toCharArray()){
            if(ar[c-'a']==0) return false;
            ar[c-'a']--;
        }
        return true;
    }
}