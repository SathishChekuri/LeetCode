class Solution {
    public int countVowelSubstrings(String word) {
        int cnt=0;
        for(int i=0;i<word.length();i++){
             HashSet<Character> hs=new HashSet<>();
             for(int j=i;j<word.length();j++){
                char c=word.charAt(j);
                 if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                     hs.add(c);
                   if(hs.size()==5) cnt++;
                 }
                 else break;
             }
            
        }
        return cnt;
    }
}