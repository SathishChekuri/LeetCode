class Solution {
    int count=0;
    public String getHappyString(int n, int k) {
        int  size=3*(int)Math.pow(2,n-1);
        StringBuilder sb=new StringBuilder();
        return helper(k,n,sb);
    }
    String helper(int k,int n,StringBuilder sb){
        if(sb.length()==n){
            count++;
            if(k==count) return sb.toString();
            return "";
        }
        if(sb.length()==0||sb.charAt(sb.length()-1)!='a'){
            sb.append('a');
            String s=helper(k,n,sb);
            if(!s.equals("")) return s;
            sb.deleteCharAt(sb.length()-1);
        }
        if(sb.length()==0||sb.charAt(sb.length()-1)!='b'){
            sb.append('b');
            String s=helper(k,n,sb);
            if(!s.equals("")) return s;
            sb.deleteCharAt(sb.length()-1);
        }
        if(sb.length()==0||sb.charAt(sb.length()-1)!='c'){
            sb.append('c');
            String s=helper(k,n,sb);
            if(!s.equals("")) return s;
            sb.deleteCharAt(sb.length()-1);
        }
        return "";
    }
}