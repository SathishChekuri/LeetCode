class Solution {
    public int reverseDegree(String s) {
        int c=1,su=0;
        for(char ch:s.toCharArray()){
            su+=('z'-ch+1)*(c++);
        }
        return su;
    }
}