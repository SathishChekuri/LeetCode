class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int i:asteroids){
            if(i>0) st.push(i);
            else{
                boolean isntBlast=true;
                while(!st.isEmpty()&&st.peek()>0){
                    if(st.peek()==Math.abs(i)){
                        st.pop();
                        isntBlast=false;
                        break;
                    }
                    else if(st.peek()<Math.abs(i)) st.pop();
                    else{
                        isntBlast=false;
                        break;
                    }
                }
                if(isntBlast) st.push(i);
                }
            }
            int []arr=new int[st.size()];
            for(int i=arr.length-1;i>=0;i--) arr[i]=st.pop();
            return arr;
    }
}