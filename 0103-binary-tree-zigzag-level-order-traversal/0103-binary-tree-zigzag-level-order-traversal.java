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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        List<List<Integer>> ar=new ArrayList<>();
         if(root==null) return ar;
        List<Integer> temp;
        int flg=0;
        while(!q.isEmpty()){
            int n=q.size();
            temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode t1=q.poll();
                if(t1.left!=null) q.add(t1.left);
                if(t1.right!=null) q.add(t1.right);
                if(flg==1) temp.add(0,t1.val);
                else temp.add(t1.val);
            }
            if(flg==1) flg=0;
            else flg=1;
            ar.add(temp);
        }
        return ar;
    }
}