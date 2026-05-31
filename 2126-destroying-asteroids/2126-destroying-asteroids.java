class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long mas=mass;
        int maxast=asteroids[asteroids.length-1];
        for(int i:asteroids){
            if(mas>=maxast) return true;
            if(i<=mas) mas+=i;
            else return false;
        }
        return true;
    }
}