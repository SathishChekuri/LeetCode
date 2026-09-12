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
    public int maxPathSum(TreeNode root) {
        int [] mx=new int[1];
        mx[0]=root.val;
        findMxPath(root,mx);
        return mx[0];
    }
    int findMxPath(TreeNode root,int [] mx){
        if(root==null) return 0;
        int l=findMxPath(root.left,mx);
        int r=findMxPath(root.right,mx);
        if(l<0) l=0;
        if(r<0) r=0;
        mx[0]=Math.max(mx[0],root.val+l+r);
        return root.val+Math.max(l,r);
    }
}