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
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null&&root.right==null) return 1;
        int l=0,r=0;
        if(root.left!=null) l=minDepth(root.left);
        if(root.right!=null) r=minDepth(root.right);
        if(l==0) return r+1;
        else if(r==0) return l+1;
        return Math.min(l,r)+1;
    }
}