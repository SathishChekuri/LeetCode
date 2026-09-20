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
    public List<Integer> inorderTraversal(TreeNode root) {
        //Morris traversal
        ArrayList<Integer> ar=new ArrayList<>();
        while(true){
            if(root==null) break;
            if(root.left==null){
                ar.add(root.val);
                root=root.right;
            }
            else{
                TreeNode curr=root.left;
                while(curr.right!=null&&curr.right!=root) curr=curr.right;
                if(curr.right==null){
                    curr.right=root;
                    root=root.left;
                }
                else{
                    curr.right=null;
                    ar.add(root.val);
                    root=root.right;
                }
            }
        }
        return ar;
    }
}