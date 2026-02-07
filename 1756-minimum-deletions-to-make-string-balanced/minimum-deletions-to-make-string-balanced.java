class Solution {
    public int minimumDeletions(String s) {
        int ra=0,lb=0,mn=s.length();
        if((s.length()<=1)||!(s.contains("a")&&s.contains("b"))) return 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                    ra++;
            }
        }
        for(int i=0;i<s.length();i++){
            mn=Math.min(ra+lb,mn);
            if(s.charAt(i)=='b') lb++;
            else if(s.charAt(i)=='a') ra--;
            mn=Math.min(ra+lb,mn);
        }
        return mn;
    }
}