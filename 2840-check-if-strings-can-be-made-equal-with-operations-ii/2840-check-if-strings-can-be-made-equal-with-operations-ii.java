class Solution {
    public boolean checkStrings(String s1, String s2) {
        int [] frq=new int[52];
        for(int i=0;i<s1.length();i++){
            int pos=(i&1)*26;
            frq[s1.charAt(i)-'a'+pos]++;
            frq[s2.charAt(i)-'a'+pos]--;
        }
        for(int i:frq){
            if(i!=0) return false;
        }
        return true;
    }
}