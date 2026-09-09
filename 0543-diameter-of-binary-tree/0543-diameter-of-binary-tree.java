/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int [] mx=new int [1];
        findmxp(root,mx);
        return mx[0];
    }
    int findmxp(TreeNode root,int [] mx){
        if(root==null) return 0;
        int lmx=findmxp(root.left,mx);
        int rmx=findmxp(root.right,mx);
        mx[0]=Math.max(rmx+lmx,mx[0]);
        return Math.max(lmx,rmx)+1;
    }
}