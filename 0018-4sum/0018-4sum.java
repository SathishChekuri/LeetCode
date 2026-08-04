class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ar=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1&&nums[j]==nums[j-1]) continue;
                int l=j+1,r=nums.length-1;
                while(l<r){
                    if(l>j+1&&nums[l-1]==nums[l]){
                        l++;
                        continue;
                    }
                    if(r<nums.length-1&&nums[r]==nums[r+1]){
                        r--;
                        continue;
                    }
                    long sum=(long)nums[i]+nums[j]+nums[l]+nums[r];
                    if(sum==target){
                        ar.add(new ArrayList<>(List.of(nums[i],nums[j],nums[l],nums[r])));
                        l++;
                        r--;
                    }
                    else if(sum<target) l++;
                    else r--;
                }
            }

        }
        return ar;
    }
}