class Solution {
    public int averageValue(int[] nums) {
        int c=0,s=0;
        for(int i:nums){
            if(i%2==0&&i%3==0){
                s+=i;
                c++;
            }
        }
        
        return (c==0)?0:s/c;
    }
}