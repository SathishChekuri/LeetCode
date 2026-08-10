class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l=1,h=position[position.length-1]-position[0];
        int ans=0;
        while(l<=h){
            int md=(int)((long)l+h)/2;
            if(ok(position,m,md)){
                ans=md;
                l=md+1;
            }
            else{
                h=md-1;
            }
        }
        return ans;
    }
    boolean ok(int arr[],int m,int gap){
        int c=1;
        int last=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-last>=gap){
                c++;
                last=arr[i];
            }
        }
        return c>=m;
    }
}