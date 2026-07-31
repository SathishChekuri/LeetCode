class Solution {
    public int minimumPushes(String word) {
        Map<Character,Integer> hs=new HashMap<>();
        for(int i=0;i<word.length();i++){
            hs.put(word.charAt(i),hs.getOrDefault(word.charAt(i),0)+1);
        }
        List<Map.Entry<Character,Integer>> entrylist=new ArrayList<>(hs.entrySet());
        entrylist.sort((entry1,entry2)->entry2.getValue().compareTo(entry1.getValue()));
        int press=1,count=0,ans=0;
        for(Map.Entry<Character,Integer> ent:entrylist){
            count++;
            if(count>8&&press==1) press=2;
            else if(count>16&&press==2) press=3;
            else if(count>24&&press==3) press=4;
            ans+=ent.getValue()*press;
        }
        return ans;
    }
}