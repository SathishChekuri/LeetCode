class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c=0;
        for(int j=0;j<words.length;j++){
            String r=words[j];
           for(int i=0;i<r.length();i++){
            if(!(allowed.contains(r.charAt(i)+""))) break;
            if(i==r.length()-1) c++;
           }
        }
        return c;
    }
}