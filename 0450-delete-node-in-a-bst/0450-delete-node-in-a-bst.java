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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val>key) root.left=deleteNode(root.left,key);
        else if(root.val<key) root.right=deleteNode(root.right,key);
        else if(root.val==key){
            if(root.left==null&&root.right==null) return null;
            else if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            else{
                int new_val=find_left(root);
                root.val=new_val;
            }
        }
        return root;
    }
    int find_left(TreeNode root){
        TreeNode prev=root,root1=root;
        root=root.right;
        while(root.left!=null){
            prev=root;
            root=root.left;
        }
        if(prev==root1) prev.right=deleteNode(root,root.val);
        else prev.left=deleteNode(root,root.val);
        return root.val;
    }
}