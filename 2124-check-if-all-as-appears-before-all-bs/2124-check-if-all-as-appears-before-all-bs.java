class Solution {
    public boolean checkString(String s) {
        int c=0;
        for(char ch:s.toCharArray()){
            if(ch=='b') c++;
            else if(c>0) return false;
        }
        return true;
    }
}