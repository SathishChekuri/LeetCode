class Solution {
    public boolean backspaceCompare(String s, String t) {
       Stack<Character> st=new Stack<>();
       for(char c:s.toCharArray()){
        if(c=='#'){
            if(!st.isEmpty()) st.pop();
        }
        else st.push(c);
       }
       Stack<Character> st1=new Stack<>();
       for(char c:t.toCharArray()){
        if(c=='#'){
            if(!st1.isEmpty())  st1.pop();
        }
        else st1.push(c);
       }
       if(st.size()!=st1.size()) return false;
       while(!st.isEmpty()){
        if(st.pop()!=st1.pop()) return false;
       }
       return true;
    }
}