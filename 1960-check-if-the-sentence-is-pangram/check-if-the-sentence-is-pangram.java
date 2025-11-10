class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        sentence=sentence.toLowerCase();
        int ar[]=new int[26];
        for(char i:sentence.toCharArray()) ar[i-'a']++;
        for(int i:ar){
            if(i==0) return false;
        }
        return true;
    }
}