class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder  r=new StringBuilder("");
        char c[]=new char[s.length()];
        for(int i=0;i<indices.length;i++){
            c[indices[i]]=s.charAt(i);
        }
        r.append(c);
        return r.toString();
    }
}