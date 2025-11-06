class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ar=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String s=words[i];
            for(int j=0;j<s.length();j++){
                char ch=s.charAt(j);
                if(ch==x){
                    ar.add(i);
                    break;
                }
            }
        }
        return ar;
    }
}