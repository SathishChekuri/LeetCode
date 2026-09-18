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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            hs.put(inorder[i],i);
        }
        return construct(inorder,0,inorder.length-1,postorder,0,postorder.length-1,hs);
    }
    TreeNode construct(int [] inorder,int sti,int edi,int [] postorder,int stp,int edp,HashMap<Integer,Integer> hs){
        if(sti>edi||stp>edp) return null;
        TreeNode root=new TreeNode(postorder[edp]);
        int ind=hs.get(postorder[edp]);
        int no=ind-sti;
        root.left=construct(inorder,sti,ind-1,postorder,stp,stp+no-1,hs);
        root.right=construct(inorder,ind+1,edi,postorder,stp+no,edp-1,hs);
        return root;
    }
}