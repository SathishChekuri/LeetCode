class Solution {
    public String replaceDigits(String s) {
        String r="";
        for(int i=0;i<s.length();i++){
            if(i%2!=0) r+=(char)(s.charAt(i-1)+Integer.parseInt(s.charAt(i)+""));
            else r+=s.charAt(i);
        }
        return r;
    }
}