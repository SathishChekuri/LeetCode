class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int mx=0;
        Set<String> hs=new HashSet<>();
        for(int i:arr2){
            String r=i+"";
            StringBuilder br=new StringBuilder();
            for(char c:r.toCharArray()){
                br.append(c);
                hs.add(br.toString());
            }
        }
            for(int j:arr1){
                String s=j+"";
                StringBuilder hr=new StringBuilder();
                for(char c:s.toCharArray()){
                    hr.append(c);
                   if(hs.contains(hr.toString())){
                    mx=Math.max(mx,hr.length());
                  }
                  else break;
               }
            }
        return mx;
    }
}