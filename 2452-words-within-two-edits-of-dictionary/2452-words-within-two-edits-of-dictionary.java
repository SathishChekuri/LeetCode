class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> res=new ArrayList<>();
        for(String r:queries){
            for(String s:dictionary){
                int c=0;
                if(s.equals(r)){
                     res.add(r);
                     break;
                }
                if(s.length()!=r.length()) continue;
                int i;
                for(i=0;i<r.length();i++){
                    if(s.charAt(i)!=r.charAt(i)) c++;
                    if(c>2) break;
                }
                 if(c<=2){
                        res.add(r);
                        break;
                    }
            }
        }
        return res;
    }
}