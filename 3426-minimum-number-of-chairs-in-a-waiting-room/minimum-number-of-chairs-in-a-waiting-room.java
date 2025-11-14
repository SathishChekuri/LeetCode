class Solution {
    public int minimumChairs(String s) {
        int c=0;
        int z=0;
        for(char ch:s.toCharArray()){
            if(ch=='E') z++;
            else {
                c=(c>z)?c:z;
                z--;
            }
        }
        return (c>z)?c:z;
    }
}