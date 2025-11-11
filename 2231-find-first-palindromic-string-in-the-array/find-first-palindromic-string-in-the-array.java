class Solution {
    public String firstPalindrome(String[] words) {
        for (String s1:words){   
            if(arr(s1)) return s1;
        }
        return "";
 }
    public boolean arr(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}