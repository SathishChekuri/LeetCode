class Solution {
    public int minAddToMakeValid(String s) {
       int cnt=0;
       Stack<Character> st=new Stack<>();
       for(char c:s.toCharArray()){
        if(c==')'){
            if(st.isEmpty()) cnt++;
            else st.pop();
        }
        else st.push('(');
       }
       return cnt+st.size();
    }
}