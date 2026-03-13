class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums=new HashSet<>();
        List<Integer> res =new ArrayList<>();
        for(int i:nums2) nums.add(i);
        for(int i:nums1){
            if(nums.contains(i)){
                res.add(i);
                nums.remove(i);
            }
        }
        int [] ar=new int[res.size()];
        int i=0;
        for(int x:res) ar[i++]=x;
        return ar;
    }
}