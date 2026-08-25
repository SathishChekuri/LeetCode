class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int ascii=(int)c;
            sb.append(String.format("%8s",Integer.toBinaryString(ascii)).replace(" ","0"));
        }
        int i=0,j=sb.length()-1;
        while(i<j){
            if(sb.charAt(i)!=sb.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}