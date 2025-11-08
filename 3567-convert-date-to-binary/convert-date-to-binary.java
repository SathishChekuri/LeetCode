import java.util.*;
class Solution {
    public String binary(String s){
        StringBuilder ans=new StringBuilder();
        int tmp=0;
        for(char ch:s.toCharArray()){
            tmp=tmp*10+(ch-'0');
        }
        while(tmp>0){
            ans.insert(0,(tmp%2==0)?"0":"1");
            tmp/=2;
        }
        return ans.toString();
    }
    public String convertDateToBinary(String date) {
       return binary(date.substring(0,4))+"-"+binary(date.substring(5,7))+"-"+binary(date.substring(8,10));
    }
}