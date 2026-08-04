class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int mn=100,mx=0;
        for(int i:nums){
            if(i<mn) mn=i;
            if(i>mx) mx=i;
        }
        int arr[]=new int[mx];
        for(int i:nums) arr[i-1]++;
        List<Integer> ans=new ArrayList<>();
        for(int i=mn;i<=mx;i++){
            if(arr[i-1]==0){
                ans.add(i);
            }
        }
        return ans;
    }
}