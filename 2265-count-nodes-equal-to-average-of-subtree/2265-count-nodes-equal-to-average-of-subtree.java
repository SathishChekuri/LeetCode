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
    public int averageOfSubtree(TreeNode root) {
        int val[]=new int[1];
        val[0]=0;
        find(root,val);
        return val[0];
    }
    int find(TreeNode root,int val[]){
       // if(val[0]!=-1) return 0;
        if(root==null) return 0;
        int sum=root.val+find(root.left,val)+find(root.right,val);
        int c=cont(root);
        if(sum/c==root.val){
            val[0]++;
        }
        return sum;
    }
    int cont(TreeNode root){
        if(root==null) return 0;
        return 1+cont(root.left)+cont(root.right);
    }
}