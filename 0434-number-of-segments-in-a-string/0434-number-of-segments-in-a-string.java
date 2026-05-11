class Solution {
    public int countSegments(String s){
        s=s.trim();
        if(s.equals("")) return 0;
        while(s.contains("  ")) s=s.replaceAll("  "," ");
        return(s.split(" ").length);
    }
}