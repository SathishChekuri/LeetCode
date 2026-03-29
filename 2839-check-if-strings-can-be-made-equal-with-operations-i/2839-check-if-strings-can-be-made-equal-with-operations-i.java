class Solution {
    public boolean canBeEqual(String s1, String s2) {
        int count=0;
        for(int i=0;i<4;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                count++;
            }
            else if((i==0||i==1)&&(s1.charAt(i)==s2.charAt(i+2)&&s2.charAt(i)==s1.charAt(i+2))){
                count+=2;
            }
        }
        if(count==4) return true;
        return false;
    }
}