class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> hs=new HashSet<>();
        for(String s:wordList) hs.add(s);
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(beginWord,1));
        while(!q.isEmpty()){
            Pair temp=q.poll();
            String word=temp.word;
            int l=temp.l;
            if(word.equals(endWord)) return l;
            for(int i=0;i<word.length();i++){
                char [] wd=word.toCharArray();
                for(int j=0;j<26;j++){
                    wd[i]=(char)('a'+j);
                    String nwd=new String(wd);
                    if(hs.contains(nwd)){
                        hs.remove(nwd);
                        q.add(new Pair(nwd,l+1));
                    }
                }
            }
        }
        return 0;
    }
}
class Pair{
    String word;
    int l;
    Pair(String word,int l){
        this.word=word;
        this.l=l;
    }
}