class Solution {
    public int[] separateDigits(int[] nums) {
        int c=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]/100000==1) c+=6;
            else if(nums[i]/10000>=1) c+=5;
            else if(nums[i]/1000>=1) c+=4;
            else if(nums[i]/100>=1) c+=3;
            else if(nums[i]/10>=1) c+=2;
            else c+=1;
        }
        int [] ar=new int[c];
        int t=c-1;
        for(int i=n-1;i>=0;i--){
             while(nums[i]>0){
                ar[t--]=nums[i]%10;
                nums[i]/=10;
             }
        }
        return ar;
    }
}