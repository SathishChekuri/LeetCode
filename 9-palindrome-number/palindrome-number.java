class Solution {
    public boolean isPalindrome(int x) {
        String y = Integer.toString(x);
        boolean result = true;
        for (int i = 0, j = y.length() - 1; i <= j; i++, j--) {
          if (y.charAt(i) != y.charAt(j)) {
            result = false;
            break;
          }
        }
        return result;
    }
}   
