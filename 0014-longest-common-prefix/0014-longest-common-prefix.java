class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder(strs[0]);
        StringBuilder prf=new StringBuilder("");
        for(int i=1;i<strs.length;i++){
            String s=strs[i];
            int n=Math.min(sb.length(),s.length());
            for(int j=0;j<n;j++){
                if(s.charAt(j)==sb.charAt(j)) prf.append(s.charAt(j));
                else break;
            }
                sb=prf;
                prf=new StringBuilder("");
                if(sb.isEmpty())  return sb.toString();
            }
            return sb.toString();  
    }
}