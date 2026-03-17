class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] arr=s.split(" ");
        HashMap<Character,String> hs=new HashMap<>();
        if(pattern.length()!=arr.length) return false;
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            if(hs.containsKey(c)){
               if(!hs.get(c).equals(arr[i])) return false;
             }
             else{
                if(hs.containsValue(arr[i])) return false;
                hs.put(c,arr[i]);
             }
        }
        return true;
    }
}