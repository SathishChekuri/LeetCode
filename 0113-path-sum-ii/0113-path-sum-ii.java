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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ar=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
         find(root,targetSum,ar,arr);
         return ar;
    }
     void find(TreeNode root,int target, List<List<Integer>> ans,List<Integer> arr){
        if(root==null) return;
        arr.add(root.val);
        target-=root.val;
        if(root.right!=null||root.left!=null){
            find(root.left,target,ans,arr);
            find(root.right,target,ans,arr);
        }
        else if(target==0){
            ans.add(new ArrayList<>(arr));
        }
        arr.remove(arr.size()-1);
        target+=root.val;
     }
}