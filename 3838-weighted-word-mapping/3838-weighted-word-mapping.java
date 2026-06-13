class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String res="";
        for(String s: words){
            int sum=0;
            for(char c:s.toCharArray()){
                sum+=weights[c-97];
                sum%=26;
            }
            res+=(char)(122-sum);
        }
        return res;
    }
}