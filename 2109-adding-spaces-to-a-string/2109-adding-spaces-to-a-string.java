class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb=new StringBuilder(s);
        int c=0;
        for(int i:spaces){
            sb.insert(i+c," ");
            c++;
        }
        return sb.toString();
    }
}