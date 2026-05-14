class Solution {
    public boolean isGood(int[] nums) {
        int [] arr=new int[201];
        int mx=0;
        for(int i:nums){
            mx=Math.max(i,mx);
            arr[i]++;
        }
        if(nums.length!=mx+1) return false;
        int flg=1;
        for(int i=1;i<mx;i++){
            if(arr[i]!=1) return false;
        }
        if(arr[mx]!=2) return false;
        return true;
    }
}