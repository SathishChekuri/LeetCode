class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int a=0;
        int b=s.length()-1;
        while(a<b){
            while(a<b&&(!(s.charAt(a)>96&&s.charAt(a)<123))&&(!(s.charAt(a)>47&&s.charAt(a)<58))) a++;
            while(a<b&&(!(s.charAt(b)>96&&s.charAt(b)<123))&&(!(s.charAt(b)>47&&s.charAt(b)<58))) b--;
            if(s.charAt(a)!=s.charAt(b)) return false;
            a++;
            b--;
        }
        return true;
    }
}