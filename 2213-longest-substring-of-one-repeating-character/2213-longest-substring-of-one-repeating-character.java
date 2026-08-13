class Solution {
    class Node {
        int len;
        int pre;
        int suf;
        int best;
        char left;
        char right;
        Node(int len,int pre,int suf,int best,char left,char right) {
            this.len=len;
            this.pre=pre;
            this.suf=suf;
            this.best=best;
            this.left=left;
            this.right=right;
        }
    }
    Node[] tree;
    public int[] longestRepeating(String s,String queryCharacters,int[] queryIndices) {
        int n=s.length();
        tree=new Node[4*n];
        build(1,0,n-1,s);
        int[] ans=new int[queryIndices.length];
        for(int i=0;i<queryIndices.length;i++) {
            update(1,0,n-1,queryIndices[i],queryCharacters.charAt(i));
            ans[i]=tree[1].best;
        }
        return ans;
    }
    void build(int node,int l,int r,String s) {
        if(l==r) {
            tree[node]=new Node(1,1,1,1,s.charAt(l),s.charAt(l));
            return;
        }
        int mid=(l+r)/2;
        build(node*2,l,mid,s);
        build(node*2+1,mid+1,r,s);
        tree[node]=merge(tree[node*2],tree[node*2+1]);
    }
    Node merge(Node a,Node b) {
        int len=a.len+b.len;
        int pre=a.pre;
        if(a.pre==a.len&&a.right==b.left)  pre=a.len+b.pre;
        int suf=b.suf;
        if(b.suf==b.len&&a.right==b.left) suf=b.len+a.suf;
        int best=Math.max(a.best,b.best);
        if(a.right==b.left)  best=Math.max(best,a.suf+b.pre);
        return new Node(
            len,
            pre,
            suf,
            best,
            a.left,
            b.right
        );
    }

    void update(int node,int l,int r,int pos,char ch) {
        if(l==r) {
            tree[node]=new Node(1,1,1,1,ch,ch);
            return;
        }
        int mid=(l+r)/2;
        if(pos<=mid) update(node*2,l,mid,pos,ch);
        else update(node*2+1,mid+1,r,pos,ch);
        tree[node]=merge(tree[node*2],tree[node*2+1]);
    }
}