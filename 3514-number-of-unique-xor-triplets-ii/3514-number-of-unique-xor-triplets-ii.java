class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int mx=0;
        for(int i:nums){
            mx=Math.max(mx,i);
        }
        int u=1;
        while(u<=mx){
            u<<=1;
        }
        boolean[] one=new boolean[u];
        boolean[] two=new boolean[u];
        boolean [] three=new boolean[u];
        for(int i:nums){
            one[i]=true;
            for(int x=0;x<u;x++){
                if(one[x]) two[x^i]=true;
            }
        }
        for(int i:nums){
            for(int x=0;x<u;x++){
                if(two[x]) three[x^i]=true;
            }
        }
        int ans=0;
        for(int i=0;i<u;i++){
            if(three[i]) ans++;
        }
       return ans;
    }
}