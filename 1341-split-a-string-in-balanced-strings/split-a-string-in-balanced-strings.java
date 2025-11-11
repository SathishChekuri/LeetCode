class Solution {
    public int balancedStringSplit(String s) {
        int c=0;
        int i=-1,j=-1;
        for(int k=0;k<s.length();k++){
            if(s.charAt(k)=='R') i++;
            else j++;
            if(i!=-1&&i==j) c++;
        }
        return c;
    }
}