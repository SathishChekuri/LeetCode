class Solution {
    public boolean squareIsWhite(String coordinates) {
        int a=(coordinates.charAt(0)-'a')+(coordinates.charAt(1)-'0');
        return (a%2==1)?false:true;
    }
}