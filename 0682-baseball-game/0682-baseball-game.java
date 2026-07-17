class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String s:operations){
            if(s.equals("+")){
                int a=st.pop();
                int sum=a+st.peek();
                st.push(a);
                st.push(sum);
            }
            else if(s.equals("C")) st.pop();
            else if(s.equals("D")){
                int a=st.pop();
                st.push(a);
                st.push(a*2);
            }
            else st.add(Integer.parseInt(s));
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}