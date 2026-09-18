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
    public int amountOfTime(TreeNode root, int start) {
        Queue<TreeNode> q=new LinkedList<>();
        HashMap<TreeNode,TreeNode> hs=new HashMap<>();
        HashSet<Integer> visited=new HashSet<>();
        q.add(search(root,start,hs));
        visited.add(start);
        int t=0;
        while(!q.isEmpty()){
            int sz=q.size();
            while(sz-->0){
                TreeNode curr=q.poll();
                if(hs.containsKey(curr)&&!visited.contains(hs.get(curr).val)){
                    q.add(hs.get(curr));
                    visited.add(hs.get(curr).val);
                }
                if(curr.left!=null&&!visited.contains(curr.left.val)){
                    q.add(curr.left);
                    visited.add(curr.left.val);
                }
                if(curr.right!=null&&!visited.contains(curr.right.val)){
                    q.add(curr.right);
                    visited.add(curr.right.val);
                }
            }
            t++;
        }
        return t-1;

    }
    TreeNode search(TreeNode root,int target,HashMap<TreeNode,TreeNode> hs){
        if(root==null||root.val==target) return root;
        if(root.left!=null){
            hs.put(root.left,root);
            TreeNode findL=search(root.left,target,hs);
            if(findL!=null) return findL;
        }
        if(root.right!=null){
            hs.put(root.right,root);
            TreeNode findr=search(root.right,target,hs);
            if(findr!=null) return findr;
        }
        return null;
    }
}