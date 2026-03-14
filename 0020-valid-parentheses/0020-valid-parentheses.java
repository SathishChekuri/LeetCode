class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='[') stk.push(c);
            else if(c==')'||c=='}'||c==']'){
                if(stk.empty()) return false;
            else if((c==')'&&stk.peek()=='(')||(c=='}'&&stk.peek()=='{')||(c==']'&&stk.peek()=='[')) stk.pop();
            else return false;
           }
        }
           if(stk.size()==0) return true;
           return false;
    }
}