class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String arr[]=text.split(" ");
        if(brokenLetters.length()==0) return arr.length;
        Set<Character> brkey=new HashSet<>();
        for(char c:brokenLetters.toCharArray()) brkey.add(c);
        int count=0;
        for(String s:arr){
            Boolean flg=true;
            for(char c:s.toCharArray()){
                if(brkey.contains(c)){
                    count++;
                    break;
                }
            }
        }
        return arr.length-count;
    }
}