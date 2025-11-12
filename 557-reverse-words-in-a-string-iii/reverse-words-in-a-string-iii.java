class Solution {
    public String reverseWords(String s) {
        String [] ar=s.split(" ");
        String r="";
        for(String s1:ar){
            for(int j=s1.length()-1;j>=0;j--) r+=s1.charAt(j);
            r+=" ";
        }
        return r.trim();
    }
}