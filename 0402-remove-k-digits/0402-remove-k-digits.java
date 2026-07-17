class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder sb=new StringBuilder();
        Stack<Integer> st=new Stack<>();
        for(char c:num.toCharArray()){
            int d=c-'0';
            while(k!=0&&!st.isEmpty()&&st.peek()>d){
                k--;
                st.pop();
            }
            if(k==0){
                while(!st.isEmpty()) sb.insert(0,st.pop());
                sb.append(d);
                continue;
            }
            st.push(d);
        }
         while(k>0&&!st.isEmpty()){
                    st.pop();
                    k--;
                }
         while(!st.isEmpty()) sb.insert(0,st.pop());
        while(sb.length()!=0&&sb.charAt(0)=='0') sb.deleteCharAt(0);
        if(sb.toString().equals("")) sb.append("0");
        return sb.toString();
    }
}