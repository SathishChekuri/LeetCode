class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder();
        int c=word.indexOf(ch);
        sb.append(word.substring(0,c+1));
        sb.reverse();
        sb.append(word.substring(c+1,word.length()));
        return sb.toString();
    }
}