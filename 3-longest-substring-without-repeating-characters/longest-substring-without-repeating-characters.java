class Solution {
    public int lengthOfLongestSubstring(String s) {
        int mxl=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        int le=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            while(hm.containsKey(ch)&&r>le){
                char c=s.charAt(le);
                if(hm.get(c)==1){
                    hm.remove(c);
                }
                else{
                    hm.put(c,hm.get(c)-1);
                }
                le++;
            }
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            mxl=Math.max(r-le+1,mxl);      
        }
        return mxl;
    }
}