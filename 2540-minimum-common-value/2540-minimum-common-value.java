class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int j=0;
        for(int i:nums1){
           while(j<nums2.length){
                if(i==nums2[j]) return i;
                if(nums2[j]>i) break;
                else j++;
            }
        }
        return -1;
    }
}