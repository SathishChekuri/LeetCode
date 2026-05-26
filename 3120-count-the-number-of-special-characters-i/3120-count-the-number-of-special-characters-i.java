class Solution {

    public int numberOfSpecialChars(String word) {

        Set<Character> lw = new HashSet<>();
        Set<Character> up = new HashSet<>();

        for(char c : word.toCharArray()){

            if(c >= 'A' && c <= 'Z'){
                up.add(c);
            }
            else{
                lw.add(c);
            }
        }

        int count = 0;

        for(char c : lw){

            if(up.contains((char)(c - 32))){
                count++;
            }
        }

        return count;
    }
}