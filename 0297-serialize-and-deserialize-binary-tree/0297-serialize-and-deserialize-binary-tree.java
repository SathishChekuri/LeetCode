/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder("");
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode cr=q.poll();
            if(cr==null){
                sb.append("null,");
                continue;
            }
            sb.append(cr.val+",");
            q.add(cr.left);
            q.add(cr.right);
        }
        return sb.substring(0,sb.length()-1);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String val[]=data.split(",");
        int i=1;
        if(val[0].equals("null")) return null;
        TreeNode root=new TreeNode(Integer.parseInt(val[0]));
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()&&i<val.length){
            int sz=q.size();
            while(sz-->0&&i<val.length){
              TreeNode curr=q.poll();
              if(curr==null) continue;
              curr.left=(val[i].equals("null"))?null:new TreeNode(Integer.parseInt(val[i]));
              q.add(curr.left);
              i++;
              curr.right=(val[i].equals("null"))?null:new TreeNode(Integer.parseInt(val[i]));
              q.add(curr.right);
              i++;
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));