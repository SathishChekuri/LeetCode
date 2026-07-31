class Solution {
    public int minimumPushes(String word) {
        int [] arr=new int[26];
        for(int i=0;i<word.length();i++){
            arr[word.charAt(i)-'a']++;
        }
        int ans=0,indx=0;
        Arrays.sort(arr);
        for(int i=25;i>=0;i--){
            if(arr[i]==0) break;
            ans+=arr[i]*(indx/8+1);
            indx++;
        }
        return ans;
    }
}