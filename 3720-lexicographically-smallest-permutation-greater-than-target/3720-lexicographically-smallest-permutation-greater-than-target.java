class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int [] frq=new int[26];
        for(int i=0;i<s.length();i++) frq[s.charAt(i)-'a']++;
        int i=0;
        for(i=0;i<target.length();i++){
            char c=target.charAt(i);
            if(frq[c-'a']>0) frq[c-'a']--;
            else{
                frq[c-'a']--;
                i++;
               break;
            }
        }
        for(int j=i-1;j>=0;j--){
            char c=target.charAt(j);
            frq[c-'a']++;
            String ans=build(frq,j,target);
            if(!ans.equals("")) return ans;
        }
        return "";
    }
    String build(int [] frq,int pos,String target){
        for(int i=target.charAt(pos)-'a'+1;i<26;i++){
            if(frq[i]>0){
                StringBuilder sb=new StringBuilder();
                for(int j=0;j<pos;j++){
                    sb.append(target.charAt(j));
                }
                sb.append((char)(i+'a'));
                frq[i]--;
                for(int j=0;j<26;j++){
                    while(frq[j]>0){
                        sb.append((char)('a'+j));
                        frq[j]--;
                    }
                }
                return sb.toString();
            }
        }
         return "";
    }
}