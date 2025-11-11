class Solution {
    public String firstPalindrome(String[] words) {
        for (String s:words){
            StringBuilder s1=new StringBuilder(s).reverse();
            if(s.equals(s1.toString())) return s;
        }
        return "";
    }
}