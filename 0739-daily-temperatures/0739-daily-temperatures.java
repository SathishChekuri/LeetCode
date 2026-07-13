class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       HashMap<Integer,Integer> hs=new HashMap<>();
       Stack<Integer> st=new Stack<>();
       for(int i=temperatures.length-1;i>=0;i--){
        int t=temperatures[i];
        while(!st.isEmpty()&&t>=st.peek()){
            st.pop();
            hs.remove(t);
        }
        if(st.isEmpty()) temperatures[i]=0;
        else temperatures[i]=hs.get(st.peek())-i;
        st.push(t);
        hs.put(t,i);
       }
return temperatures;
    }
}