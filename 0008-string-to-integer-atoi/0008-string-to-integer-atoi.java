class Solution {
    public int myAtoi(String s) {
        int i=0;
        long res=0;
        int sign=1;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)==' '||s.charAt(i)=='_') continue;
            else break;
        }
        //if(i<s.length()&&s.charAt(i)=='+') i++;
        if(i<s.length()){
            if(s.charAt(i)=='-'){
            sign=-1;
            i++;
            }
            else if(s.charAt(i)=='+') i++;
        }
        while(i<s.length()){
            if(s.charAt(i)<'0'||s.charAt(i)>'9') break;
            res=res*10+(s.charAt(i)-'0');
             if (sign * res > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign * res < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            i++;
        }
        return (int)res*sign;
    }
}