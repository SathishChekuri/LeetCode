class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long mas=mass;
        for(int i:asteroids){
            if(i<=mas) mas+=i;
            else return false;
        }
        return true;
    }
}