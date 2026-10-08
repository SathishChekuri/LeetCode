class Solution {
    public String removeOuterParentheses(String s) {
        int yes=0;
        StringBuilder sb=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                 if((!st.isEmpty())||(st.isEmpty()&&yes==1)){
                    st.push('(');
                    sb.append("(");
                }
                else yes=1;
            }
            else{
                if(!st.isEmpty()){
                    sb.append(")");
                    st.pop();
                }
                else yes=0;
            } 
        }
        return sb.toString();
    }
}