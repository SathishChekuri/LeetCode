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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        traverse(l,root);
        return l;
    }
    void traverse(List<Integer> l,TreeNode root){
        if(root==null) return;
        traverse(l,root.left);
        traverse(l,root.right);
        l.add(root.val);
    }
}