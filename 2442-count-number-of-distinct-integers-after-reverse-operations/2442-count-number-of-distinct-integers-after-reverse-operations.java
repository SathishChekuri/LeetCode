class Solution {
    public int countDistinctIntegers(int[] nums) {
        int reversed[]=new int[nums.length];
         HashSet<Integer> hs=new HashSet<>();
         int ind=0;
        for(int i:nums){
            hs.add(i);
            int rev=0;
            while(i>0){
                rev=rev*10+(i%10);
                i/=10;
            }
          reversed[ind++]=rev;
        }
        for(int i:reversed){
            hs.add(i);
        }
        System.out.println(hs.toString());
        return hs.size();
    }
}