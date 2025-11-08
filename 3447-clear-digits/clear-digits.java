class Solution {
    public String clearDigits(String s) {
       StringBuilder st=new StringBuilder();
       for(char c:s.toCharArray()){
        if(!Character.isDigit(c)){
            st.append(c);
        }
        else if(st.length()>0){
            st.deleteCharAt(st.length()-1);
        }
       }
       return st.toString(); 
    }
}