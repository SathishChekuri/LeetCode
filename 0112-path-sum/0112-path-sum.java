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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return find_path(root,0,targetSum);
    }
    boolean find_path(TreeNode root,int sum,int target){
       // if(sum>target) return false;
        if(root==null) return false;
        sum+=root.val;
        if(root.left!=null||root.right!=null){
            if(find_path(root.left,sum,target)) return true;
            if(find_path(root.right,sum,target)) return true;
        }
        else if(sum==target) return true;
        return false;
    }
}