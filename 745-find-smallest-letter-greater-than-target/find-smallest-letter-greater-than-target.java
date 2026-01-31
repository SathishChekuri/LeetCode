class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
         char smc='z';
         int flg=0;
         for(int i=0;i<letters.length;i++){
            if(letters[i]>target&&letters[i]<=smc){
                flg=1;
                smc=letters[i];
            }
         }
         if(flg==0) return letters[0];
         return smc;
    }
}