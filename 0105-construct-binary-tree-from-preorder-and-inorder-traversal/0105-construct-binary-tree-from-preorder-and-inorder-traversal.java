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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            hs.put(inorder[i],i);
        }
        return construct(preorder,0,preorder.length-1,inorder,0,inorder.length-1,hs);
    }
    TreeNode construct(int [] preorder,int  stp,int edp,int inorder[],int sti,int edi,HashMap<Integer,Integer> hs){
        if(stp>edp||sti>edi) return null;
        TreeNode root=new TreeNode(preorder[stp]);
        int ind=hs.get(preorder[stp]);
        int no=ind-sti;
        root.left=construct(preorder,stp+1,stp+no,inorder,sti,ind-1,hs);
        root.right=construct(preorder,stp+no+1,edp,inorder,ind+1,edi,hs);
        return root;
    }
}