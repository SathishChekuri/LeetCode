class Solution {
    public String longestPalindrome(String s) {
        int mx=1;
        //if(s.length()==1) return s;
        String res=s.charAt(0)+"";
        for(int i=0;i<s.length()-1;i++){
            String e=expand(s,i,i);
            String o=expand(s,i,i+1);
            if(e.length()>mx){
                res=e;
                mx=e.length();
            }
            if(o.length()>mx){
                res=o;
                mx=o.length();
            }
        }
        return res;
    }
    String expand(String s,int i,int j){
        while((i>=0&&j<s.length())&&(s.charAt(i)==s.charAt(j))){
            i--;
            j++;
        }
        return s.substring(i+1,j);
    }
}