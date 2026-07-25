class Solution {
    public List<String> commonChars(String[] words) {
        List<String> st=new ArrayList<>();
           for(char c:words[0].toCharArray()){
              int j=1;
            for(;j<words.length;j++){
                if(!words[j].contains(c+"")) break;
                else{
                    words[j]=words[j].replaceFirst(c+"","");
                }
            }
            if(j==words.length){
                st.add(c+"");
            }
           }
        return st;
    }
}