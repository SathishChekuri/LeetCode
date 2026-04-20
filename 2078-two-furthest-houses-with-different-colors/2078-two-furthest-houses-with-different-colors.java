class Solution {
    public int maxDistance(int[] colors) {
        int mx=0,n=colors.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(colors[i]!=colors[j]){
                    mx=Math.max(mx,Math.abs(j-i));
                }
            }
        }
        return mx;
    }
}