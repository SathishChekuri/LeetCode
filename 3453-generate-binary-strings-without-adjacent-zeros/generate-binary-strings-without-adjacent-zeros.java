import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        fun(result, new StringBuilder(), n, -1);
        return result;
    }
    
    private void fun(List<String> result, StringBuilder sb, int n, int lastChar) {
        if (sb.length() == n) {
            result.add(sb.toString());
            return;
        }
    
        sb.append('1');
       fun(result, sb, n, 1);
        sb.deleteCharAt(sb.length() - 1);
        
       
        if (lastChar != 0) {
            sb.append('0');
           fun(result, sb, n, 0);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}