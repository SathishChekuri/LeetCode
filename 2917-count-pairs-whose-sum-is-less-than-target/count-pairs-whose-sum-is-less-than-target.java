class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int cp=0;
        for(int i=0;i<nums.size()-1;i++){
            int s=nums.get(i);
            for(int j=i+1;j<nums.size();j++){
                if(s+nums.get(j)<target) cp++;
            }
        }
        return cp;
    }
}