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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=new TreeNode(preorder[0]);
        for(int i=1;i<preorder.length;i++){
            insert(root,preorder[i]);
        }
        return root;
    }
    void insert(TreeNode root,int data){
        if(root.val<data){
            if(root.right==null){
                root.right=new TreeNode(data);
                return;
            }
           insert(root.right,data);
        }
        if(root.val>data){
            if(root.left==null){
                root.left=new TreeNode(data);
                return;
            }
           insert(root.left,data);
        }
    }
}