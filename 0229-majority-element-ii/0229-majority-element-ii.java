class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ele1=Integer.MIN_VALUE,ele2=Integer.MIN_VALUE;
        int c1=0,c2=0;
        for(int i:nums){
            if(c1==0&&ele2!=i){
                c1++;
                ele1=i;
            }
            else if(c2==0&&ele1!=i){
                c2++;
                ele2=i;
            }
            else if(ele1==i) c1++;
            else if(ele2==i) c2++;
            else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int i:nums){
            if(i==ele1) c1++;
            if(i==ele2) c2++;
        }
        List<Integer> ar=new ArrayList<>();
        if(c1>nums.length/3) ar.add(ele1);
        if(c2>nums.length/3) ar.add(ele2);
        return ar;
    }
}