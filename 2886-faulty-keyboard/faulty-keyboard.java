class Solution {
    public String finalString(String s) {
        StringBuilder r=new StringBuilder();
        for(char i:s.toCharArray()){
            if(i=='i') r.reverse();
            else r.append(i);
        }
        return r.toString();
    }
}