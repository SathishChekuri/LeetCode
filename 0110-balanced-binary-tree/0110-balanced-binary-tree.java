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
    public boolean isBalanced(TreeNode root) {
        if(bal(root)==-1) return false;
        return true;
    }
    int bal(TreeNode root){
        if(root==null) return 0;
        int l=bal(root.left);
        int r=bal(root.right);
        if(Math.abs(r-l)>1||l==-1||r==-1) return -1;
        return 1+Math.max(l,r);
    }
}