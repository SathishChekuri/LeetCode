/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Queue<TreeNode> q=new LinkedList<>();
        TreeNode temp=root;
        HashMap<TreeNode,TreeNode> hs=new HashMap<>();
        HashSet<Integer> visited=new HashSet<>();
        visited.add(target.val);
        q.add(search(root,hs,target.val));
        while(!q.isEmpty()){
            if(k==0) break;
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
            k--;
        }
        List<Integer> ar=new ArrayList<>();
        while(!q.isEmpty()){
            ar.add(q.poll().val);
        }
        return ar;
    }
    TreeNode search(TreeNode root,HashMap<TreeNode,TreeNode> hs,int target){
        if(root==null||root.val==target) return root;
        if(root.left!=null){
            hs.put(root.left,root);
            TreeNode findl=search(root.left,hs,target);
            if(findl!=null) return findl;
        }
        if(root.right!=null){
            hs.put(root.right,root);
            TreeNode findr=search(root.right,hs,target);
            if(findr!=null) return findr;
        }
        return null;
    }
}