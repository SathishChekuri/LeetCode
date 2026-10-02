class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        find(n,0,0,sb,ans);
        return ans;
    }
    void find(int n,int op,int cl,StringBuilder sb,List<String> ans){
        if(sb.length()==2*n){
            ans.add(sb.toString());
            return ;
        }
        if(op<n){
            sb.append('(');
            find(n,op+1,cl,sb,ans);
            sb.deleteCharAt(sb.length()-1);
        }
        if(cl<op){
            sb.append(')');
            find(n,op,cl+1,sb,ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}