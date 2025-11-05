class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> ar=new ArrayList<>();
        String a="qwertyuiop";
        String b="asdfghjkl";
        String c="zxcvbnm";
        for(String j:words){
            if(am(j,a)||am(j,b)||am(j,c)) ar.add(j);
        }
        return ar.toArray(new String[0]);
    }
    public boolean am(String a,String b){
        a=a.toLowerCase();
        for(char c:a.toCharArray()) {
            if(b.indexOf(c)==-1) return false;
        }
        return true;
    }
}