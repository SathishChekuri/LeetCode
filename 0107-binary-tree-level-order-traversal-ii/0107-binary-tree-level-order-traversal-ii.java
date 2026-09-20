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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ar=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        if(root==null) return ar;
        while(!q.isEmpty()){
             int sz=q.size();
             List<Integer> temp=new ArrayList<>();
             while(sz-->0){
                TreeNode curr=q.poll();
                temp.add(curr.val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
             }
             ar.add(temp);
        }
        int i=0,j=ar.size()-1;
        while(i<j){
            List<Integer> t=ar.get(i);
            ar.set(i,ar.get(j));
            ar.set(j,t);
            i++;
            j--;
        }
        return ar;
    }
}