class Solution {
    public boolean hasSameDigits(String s) {
        //int a=Integer.parseInt(s);
        while(s.length()>2){
          String s1="";
          for(int i=0;i<s.length()-1;i++){
            int t=(s.charAt(i)-'0')+(s.charAt(i+1)-'0');
            s1+=t%10;
          }
          s=s1;
        }
        if(s.charAt(0)==s.charAt(1)) return true;
        else return false;
    }
}